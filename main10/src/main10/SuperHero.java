package main10;

//Main10_03で定義したSuperHeroクラス
public class SuperHero extends Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");

	}

	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	//Main10_05で追加
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	//Main10_09で追加
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
}
