package kadai;

//・図形描画アプリケーションの共通機能3つを定義する。
//・図形描画機能
//・長さ測定機能
//・内角の和測定機能
public abstract class Polygon extends Shape {
	//内角(辺)の数を表すprotectedフィールド
	protected int angel;

	/**
	 * angleフィールドを使い、内角の和を算出する
	 * 例）n角形の場合　　(n - 2) * 180
	 * @return
	 */
	public int getInternalAngle() {

	}
}
