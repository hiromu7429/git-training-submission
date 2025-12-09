package kadai;

// ・座標位置情報を表すクラス
public class Point {
	//・x座標を表すprivateフィールド
	private int x;
	//・y座標を表すprivateフィールド
	private int y;

	/**
	 *  
	 *・引数なしコンストラクタの定義x座標、y座標ともに0で初期化する。
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 *・x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	 *第1引数で渡された値をxフィールドに代入する。
	 *第2引数で渡された値をyフィールドに代入する。
	 * @param x X座標の値
	 * @param y Y座標の値
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 *・xフィールドの値を返すメソッド
	 * @return X座標の値を戻す
	 */
	public int getX() {
		return this.x;
	}

	/**
	 *・引数で渡された値を、xフィールドにセットするメソッド
	 * @param x 指定した値をX座標に代入
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 *・yフィールドの値を返すメソッド
	 * @return Y座標の値を戻す
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * ・引数で渡された値を、yフィールドにセットするメソッド
	 * @param y 指定した値をY座標に代入
	 */
	public void setY(int y) {
		this.y = y;
	}
}
