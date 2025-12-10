package main17;

//例外処理を用意していないと…(エラー)
import java.io.FileWriter;

public class Main17_01 {
	public static void main(String[] args) {
		FileWriter fw = new FileWriter("data.txt");
	}
}
