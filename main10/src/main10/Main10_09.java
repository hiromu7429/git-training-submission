package main10;

//親クラスのattack()を呼び出す
public class Main10_09 {
	public class SuperHero extends Hero {
		boolean flying;

		public void attack(Matango m) {
			super.attack(m);
			if (this.flying) {
				super.attack(m);
			}
		}
		//…
	}
}
