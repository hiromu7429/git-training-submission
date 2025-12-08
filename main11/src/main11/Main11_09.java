package main11;

//抽象メソッドのオーバーライド忘れ（エラー）
public class Main11_09 extends Character {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
}
