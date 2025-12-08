package main12;

//MonsterとSlimeの逃げ方を調べる
public class Main12_05 {
	public static void main(String[] args) {
		Slime s = new Slime();
		Monseter m = new Slime();
		s.run();
		m.run();
	}
}

//Monster.java
public abstract class Monseter {
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}
}

//Slime.java
public class Slime extends Monster {
	public void run() {
		System.out.println("スライムはサササっと逃げ出した。");
	}
}