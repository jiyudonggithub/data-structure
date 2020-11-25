package day0417.interfaces;
/**
 * ICBC的接口继承UnionPay
 * @author jiyudong
 *
 */
public interface ICBC extends UnionPay {
	/**
	 * 在线支付
	 * @param money
	 */
	public void payOnLine(double money);
}
