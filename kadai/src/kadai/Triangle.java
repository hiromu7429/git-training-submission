package kadai;

//・3つの座標データを指定することで、三角形を描画するクラス
//・三角形描画メソッド
//・三角形の周囲の長さを取得するメソッド
public class Triangle extends Polygon {
	//・三角形の点1を表すPoint型privateフィールド
	private Point p1;
	//・三角形の点2を表すPoint型privateフィールド
	private Point p2;
	//・三角形の点3を表すPoint型privateフィールド
	private Point p3;

	/**
	 *引数で受け取ったデータを用いて、3つのPointオブジェクトを生成。
	 *p1フィールドとp2フィールド、p3フィールドにそれぞれを代入する。
	 *スーパークラス内で定義されているangleフィールドに3を代入する。
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

	}

	/**
	 * 以下のようなメッセージを表示する。
	 * 出力例：
	 * "[三角形を描画] 点1(0,0)から点2(100,100)、点3(0, 200)の三角形"
	 */
	public void draw() {

	}

	/**
	 *3つの座標を使い、以下の計算式で算出した結果を返す。
	 *p1からp2までの長さ + p2からp3までの長さ + p3からp1までの長さ
	 * @return
	 */
	public double geterimeter() {

	}
}
