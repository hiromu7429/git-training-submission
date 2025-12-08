package main11;

//Characterを抽象クラスとして宣言する
public abstract class Main11_08 {
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

	public abstract void attack(Matango m);
}
