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
	 * @param x1 p1のX座標の値
	 * @param y1 p1のY座標の値
	 * @param x2 p2のX座標の値
	 * @param y2 p2のY座標の値
	 * @param x3 p3のX座標の値
	 * @param y3 p3のY座標の値
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		super.angle = 3;
	}

	/**
	 * 以下のようなメッセージを表示する。
	 * 出力例：
	 * "[三角形を描画] 点1(0,0)から点2(100,100)、点3(0, 200)の三角形"
	 */
	public void draw() {
		int x1 = 0;
		x1 = this.p1.getX();
		int y1 = 0;
		y1 = this.p1.getY();
		int x2 = 0;
		x2 = this.p2.getX();
		int y2 = 0;
		y2 = this.p2.getY();
		int x3 = 0;
		x3 = this.p3.getX();
		int y3 = 0;
		y3 = this.p3.getY();
		System.out.println(
				"[三角形を描画]点1(" + (x1 + "," + y1) + ")から点2(" + (x2 + "," + y2) + ")、点3(" + (x3 + "," + y3) + ")の三角形");
	}

	/**
	 *3つの座標を使い、以下の計算式で算出した結果を返す。
	 *p1からp2までの長さ + p2からp3までの長さ + p3からp1までの長さ
	 * @return 各辺の合計
	 */
	public double getPerimeter() {
		double p2p1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + (Math.pow(p2.getY() - p1.getY(), 2)));
		double p3p2 = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + (Math.pow(p3.getY() - p2.getY(), 2)));
		double p1p3 = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + (Math.pow(p1.getY() - p3.getY(), 2)));

		return p2p1 + p3p2 + p1p3;
	}
}