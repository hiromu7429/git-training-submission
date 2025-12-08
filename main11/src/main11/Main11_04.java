package main11;

//オーバーライドを忘れたHeroクラス

//Hero.java
public class Hero extends Character {

}

//Main.java
public class Main11_04 {
	public static void main(String[] args) {
		Hero h = new Hero();
		Matango m = new Matango();
		h.attack(m);
	}
}
