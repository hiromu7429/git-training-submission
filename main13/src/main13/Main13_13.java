package main13;

//setterメソッドで値の妥当性をチェックする
public class Main13_13 {
	private String name;

	public void setName(String namae) {
		if (name == null) {
			throw new IllegalArgumentExeption("名前がnullである。処理を中断。");

		}
		if (name.length() <= 1) {
			throw new IlleagalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IlleagalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
}
