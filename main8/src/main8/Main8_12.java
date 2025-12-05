package main8;

//勇者インスタンスを生成して初期値を代入
public class Main8_12 {
	public static void main(String[] args) {
		//1．勇者を生成
		Main8_08 h = new Main8_08();//教科書のHeroクラスに該当するのはMain8_08クラス
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
	}
}
