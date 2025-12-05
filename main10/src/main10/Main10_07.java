package main10;

//slip()はオーバーライドできないHeroクラス
public class Main10_07 {
	public class Hero {
		String name = "ミナト";
		int hp = 100;

		//…
		public final void slip() {
			this.hp -= 5;
			System.out.println(this.name + "は転んだ！");
			System.out.println("5のダメージ");

		}

		public void run() {
			System.out.println(this.name + "は逃げ出した！");

		}
		//…
	}
}
