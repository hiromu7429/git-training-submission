package kadai;

//・図形描画アプリケーションの共通機能3つを定義する。
//・図形描画機能
//・長さ測定機能
//・内角の和測定機能
public abstract class Polygon extends Shape {
	//内角(辺)の数を表すprotectedフィールド
	protected int angle;

	/**
	 * angleフィールドを使い、内角の和を算出する
	 * 例）n角形の場合　　(n - 2) * 180
	 * @return　内角の和を戻す
	 */
	public int getInternalAngle() {
		return (this.angle - 2) * 180;
	}
}
