package main14;

//静的メソッドから非静的メンバを利用（エラー）
public class Main14_15 {
	String name;
	int hp;
	static int money;

	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		System.out.println(this.name + "たちの所持金を初期化しました");
	}
}
