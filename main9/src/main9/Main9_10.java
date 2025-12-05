package main9;

//コンストラクタで引数を追加情報として受け取る
public class Main9_10 {
	public class Hero {
		String name;
		int hp;

		//…
		public Hero(String name) {
			this.hp = 100;
			this.name = name;//引数の値でnameフィールドを初期化
		}
	}
}
