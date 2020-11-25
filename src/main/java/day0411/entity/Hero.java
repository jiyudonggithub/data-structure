package day0411.entity;

public class Hero {
	public int pow = 100;
	public String name;

	public Hero(int pow, String name) {
		super();
		this.pow = pow;
		this.name = name;
	}

	public Hero(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [pow=" + pow + ", name=" + name + "]";
	}

	public void go() {
		if (pow <= 0) {
			System.out.println(this.name + "英雄已死亡");
		} else {
			System.out.println("英雄已踏上征途");
		}

	}

	public void eat(int n) {
		if (this.pow <= 0) {
			System.out.println(this.name + "英雄已死亡,不可复活");
			return;
		}
		this.pow += n;
		this.pow = this.pow > 100 ? 100 : this.pow;
		System.out.println(this.name + "英雄的体力值为" + this.pow);
	}

	public void hurt() {
		this.pow -= 10;
		this.pow = this.pow < 0 ? 0 : this.pow;
		if (this.pow == 0) {
			System.out.println(this.name + "英雄已死亡");
		} else {
			System.out.println(this.name + "英雄的受到伤害,体力值为" + this.pow);
		}

	}

}
