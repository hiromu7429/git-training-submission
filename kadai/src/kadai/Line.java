package kadai;

//・2つの座標データを指定することで、線を描画するクラス
//・線描画メソッド
//・線の長さを取得するメソッド
public class Line implements Figure {
	//・線の始点を表すPoint型privateフィールド
	private Point p1;
	//・線の終点を表すPoint型privateフィールド
	private Point p2;

	/**
	 *・引数なしコンストラクタの定義
	 *p1(x,y座標)、p2(x,y座標)全て0で初期化する。
	 */
	public Line() {
		Point p1 = new Point();
		Point p2 = new Point();
	}

	/**
	 *引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。
	 *p1フィールドとp2フィールドにそれぞれを代入する。
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Line(int x1, int y1, int x2, int y2) {

	}

	/**
	 *以下のようなメッセージを表示する。なお、始点をp1、終点をp2とする。
	 *出力例：
	 *"[線を描画] 始点(0,0)から終点(100,100)まで"
	 */
	public void draw() {

	}

	/**
	 * 始点データと終点データを使い、以下の計算式で算出した結果を返す。
	 *  (( 終点のx座標 - 始点のx座標 ) ^2
	 * + ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根
	 * 
	 */
	public double getPerimeter() {

	}
}
