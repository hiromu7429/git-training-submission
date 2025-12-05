package main10;

//attack()をオーバーライドしたSuperHero
public class Main10_08 {
	public class SuperHero extends Hero {
		boolean flying;

		//…
		public void attack(Matango m) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
			if (this.flying) {
				System.out.println(this.name + "の攻撃！");
				m.hp -= 5;
				System.out.println("5ポイントのダメージをあたえた！");
			}
		}
	}
}
