package main15;

//replaceAllメソッドを使った文字列の置換
public class Main15_08 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}
}
