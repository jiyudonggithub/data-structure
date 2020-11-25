package studentDB.dao;

import java.util.List;

import studentDB.entity.Student;

/**
 * 学生dao接口
 * 
 * @author 李帅
 *
 */
public interface StudentDao {
	/**
	 * 增
	 * 
	 * @param stu
	 */
	void addStu(Student stu);
	/**
	 * 根据学生id删除学生
	 * @param id
	 */
	void deleteStu(int id);
	/**
	 * 修改学生信息
	 * @param stu
	 */
	void modifyStu(Student stu);
	/**
	 * 查询学生信息
	 * @param name
	 * @return
	 */
	List<Student> selectStu(String name);
	
}
