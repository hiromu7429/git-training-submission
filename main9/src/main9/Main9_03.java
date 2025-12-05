package main9;

//Sword型フィールドを持つHeroクラス
public class Main9_03 {
	//まず、Swordクラスを定義しておく
	public class Sword {
		String name;
		int damege;
	}

	//次にHeroクラスを定義する
	public class Hero {
		String name;
		int hp;
		Sword sword;

		public void attack() {
			System.out.println(this.name + "は攻撃した！");
			System.out.println("敵に5ポイントのダメージをあたえた！");
		}
	}
}
