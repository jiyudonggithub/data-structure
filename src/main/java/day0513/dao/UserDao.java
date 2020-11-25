package day0513.dao;

import java.util.List;

import day0513.entity.User;
/**
 * user的持久层
 * @author jiyudong
 *
 */
public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 */
	void add(User user);
	/**
	 * 判断name是否存在
	 * 如果存在返回true
	 * @param name
	 * @return
	 */
	boolean exisetUserName(String name);
	/**
	 * 判断name和password是否匹配
	 * 如果匹配返回true
	 * @param name
	 * @param passward
	 * @return
	 */
	boolean isexistPssward(String name,String passward);
	/**
	 * 模糊查询
	 * @param name
	 * @return
	 */
	List<User> findAll(String name);
}
