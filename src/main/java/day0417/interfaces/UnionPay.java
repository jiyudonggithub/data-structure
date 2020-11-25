package day0417.interfaces;

/**
 * 银联接口
 * 
 * @author jiyudong
 *
 */

public interface UnionPay {

	/**
	 * 查询密码
	 * 
	 * @param pwd
	 * @return
	 */
	public boolean checkPwd(String pwd);

	/**
	 * 取钱
	 * 
	 * @param money
	 */
	public void drawMoeny(double money);

	/**
	 * 查询余额
	 * 
	 * @return
	 */
	public double getBalance();

}
