package main18;

//ファイルから1文字ずつ詠み込む
import java.io.FileReader;

public class Main18_01 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char) input);
			input = fr.read();
		}
		fr.close();
	}
}
