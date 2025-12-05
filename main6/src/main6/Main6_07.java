package main6;

//別のパッケージにあるクラスを呼び出す
public class Main6_07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = main6.Main6_02.tasu(a, b);//課題提出の関係で別パッケージは作成していない
		int delta = main6.Main6_02.hiku(a, b);//同じmain6に所属しているクラスを呼び出している
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
