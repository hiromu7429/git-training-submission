package main12;

//Monsterなら何でも攻撃できるattackメソッド
public class Main12_09 extends Character {
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
