package main9;

//Main9_03で定義したHeroクラス
public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");

	}

	//Main9_08,10,12,16を以下に追記および編集
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this("ダミー");
	}
}
