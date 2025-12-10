package main17;

//後片付け処理もtry-catchする
import java.io.FileWriter;

public class Main17_08 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");

		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				;
			}
		}
	}
}
