package day0412.entity;

public class Truck extends Car {
	public double praylaod;

	/**
	 * 有参构造
	 * 
	 * @param wheels
	 *            车轮数
	 * @param weight
	 *            车重
	 * @param loader
	 *            车载人数
	 * @param praylaod
	 *            车载重
	 */
	public Truck(int wheels, double weight, int loader, double praylaod) {
		super(wheels, weight, loader);
		this.praylaod = praylaod;
	}

	/**
	 * tostring
	 */
	@Override
	public String toString() {
		return "Truck [praylaod=" + praylaod + ", loader=" + loader + ", wheels=" + wheels + ", weight=" + weight + "]";
	}

}
