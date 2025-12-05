package main10;

//コンストラクタの動作を確認する
public class Main10_10 {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
	}
}

//Heroクラスに下記を追加
public class Hero {
	//…
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	//…
}

//SuperHeroクラスに下記を追加
public class SuperHero extends Hero {
	//…
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
}
//上記2つを追加した実行結果が教科書通りになることを確認、上記コードは各クラスから削除済