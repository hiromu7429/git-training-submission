package main12;

//Characterを継承して定義されたWizardクラス
public class Main12_02 {

}

public abstract class Character {
	String name;
	int hp;

	public void run() {

	}

	public abstract void attack(Matango m);
}

public class Wizard extends Character {
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
	}
}

public class Wizard extends Character {
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.pritnln("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}

}