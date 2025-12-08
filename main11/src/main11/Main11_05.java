package main11;

//オーバーライドしたつもりのHeroクラス
public class Main11_05 extends Character {
	public void atack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージを与えた！");
		m.hp -= 10;
	}

}
