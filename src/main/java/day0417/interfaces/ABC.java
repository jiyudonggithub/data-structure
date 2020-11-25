package day0417.interfaces;
/**
 * ABC的接口继承UnionPay
 * @author jiyudong
 *
 */
public interface ABC extends UnionPay {
	/**
	 * 给电话缴费
	 * @param tel 电话号
	 * @param money
	 */
	public void payTelBill(String tel, double money);

}
