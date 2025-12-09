package kadai;

//・1つの位置座標と幅を指定することで、正方形を描画するクラス
//・正方形描画メソッド
public class Square extends Rectangle {
	/**
	 *スーパークラスRectangleのコンストラクタを明示的に呼び出す。
	 *引数は以下の通りとする。
	 *第1引数...Point型データのx座標
	 *第2引数...Point型データのy座標
	 *第3引数...正方形の一辺の長さ
	 *第4引数...正方形の一辺の長さ
	 * @param x
	 * @param y
	 * @param width(幅=高さ)
	 */
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	/**
	 *以下のようなメッセージを表示する。
	 *出力例：
	 *[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"
	 */
	public void draw() {
		int x = 0;
		x = this.p.getX();
		int y = 0;
		y = this.p.getY();
		System.out.println(
				"[正方形を描画]点" + (x + "," + y) + "を基準として幅・高さ" + this.width + "の正方形");

	}

}
