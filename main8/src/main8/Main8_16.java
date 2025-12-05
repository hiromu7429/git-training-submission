package main8;

//仮想世界に勇者とお化けキノコ2匹を生み出す
public class Main8_16 {
	public static void main(String[] args) {
		Main8_08 h = new Main8_08();//教科書のHeroクラスに該当するのはMain8_08クラス
		h.name = "ミナト";
		h.hp = 100;

		Main8_15 m1 = new Main8_15();//教科書のMatangoクラスに該当するのはMain8_15クラス
		m1.hp = 50;
		m1.suffix = 'A';

		Main8_15 m2 = new Main8_15();//教科書のMatangoクラスに該当するのはMain8_15クラス
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
