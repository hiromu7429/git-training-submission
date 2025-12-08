package main11;

//未来の開発者が作成するHero(Main11_03)クラス
public class Main11_03 extends Character {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
