package studentDB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentDB.entity.Student;
import studentDB.util.MyDBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStu(Student stu) {
		Connection conn = MyDBUtil.getConn();
		
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		ResultSet rs = null;
		String sql = null;
		try {
			if (stu.getId() ==null) {
				//执行添加操作
				 sql = "insert into student value (null,?,?,?)";
			}else {
				sql = "insert into student value ("+stu.getId()+",?,?,?)";
			}
			//如果需要获取插入数据之后自增的主键，再获取ps时需要传入第二个参数
			//第二个参数为一个string数组，数组内容为自增主键字段名
			 ps1 = conn.prepareStatement(sql,new String[]{"id"});
			 ps1.setString(1, stu.getName());
			 ps1.setString(2, stu.getPassword());
			 ps1.setString(3, stu.getTel());
			 //执行插入student表中的sql语句
			 ps1.executeUpdate();
			 
			 //获取刚插入数据生成的自增主键id
			  rs = ps1.getGeneratedKeys();
			 //因为自增的主键就是在rs的第一行第一列所以
			 rs.next();
			 int s_id = rs.getInt(1);
			 List<Integer> hobby = stu.getHobby();
			 // 学生id为1 学生爱好为 1 2 3
			 StringBuilder sb = new StringBuilder();
			sb.append("insert into s_hobby value ");
			 for (Integer integer : hobby) {
				sb.append("("+s_id+","+integer+"),");
			}
			 String sql2 = sb.toString();
			 //通过substring方法去掉最后多的逗号
			 sql2 = sql2.substring(0,sql2.length()-1);
			 ps2 = conn.prepareStatement(sql2);
			 ps2.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//对关闭资源进行优化
			MyDBUtil.closeAll(rs,ps1,ps2,conn);
		}
		
	}

	@Override
	public void deleteStu(int id) {
		Connection conn = MyDBUtil.getConn();
		String sql1 = "delete from student where id = ?";
		String sql2 = "delete from student_hobby where s_id = ?";
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			ps1 = conn.prepareStatement(sql1);
			ps2 = conn.prepareStatement(sql2);
			
			ps1.setInt(1, id);
			ps2.setInt(1, id);
			
			ps1.executeUpdate();
			ps2.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MyDBUtil.closeAll(ps1,ps2,conn);
		}
	}

	@Override
	public void modifyStu(Student stu) {
		// 修改的逻辑先删除在添加
		deleteStu(stu.getId());
		addStu(stu);
	}

	@Override
	public List<Student> selectStu(String name) {
		List<Student> list = new ArrayList<Student>();
		Connection conn = MyDBUtil.getConn();
		String sql1 = "select s.* from student where id = ?";
		return null;
	}

}
