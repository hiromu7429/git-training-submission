package kadai;

//・中心座標と半径を指定することで、円を描画するクラス
//・円描画メソッド
//・円周の長さを取得するメソッド
public class Circle extends Shape {
	//・円の中心を表すPoint型privateフィールド
	private Point center;
	//・円の半径を表すprivateフィールド
	private int radius;

	/**
	 *・引数なしコンストラクタの定義
	 *center(x,y座標)、半径全て0で初期化する
	 */
	public Circle() {

	}

	/**
	 *引数x,yで受け取ったデータを用いて、1つのPointオブジェクトを生成し、centerフィールドに代入する。
	 *引数rもradiusフィールドに代入する。
	 * @param x
	 * @param y
	 * @param r
	 */
	public Circle(int x, int y, int r) {

	}

	/**
	 *以下のようなメッセージを表示する。
	 *出力例：
	 *"[円を描画] 中心点(100,100)から半径20"
	 */
	public void draw() {

	}

	/**
	 *半径を使い、以下の計算式で算出した結果を返す
	 *半径 * 2 * 円周率
	 *
	 *円周率...Math.PIフィールド
	 */
	public double getPerimeter() {

	}

}
