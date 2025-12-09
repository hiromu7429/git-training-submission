package kadai;
//・図形描画機能の定義

//・長さ測定機能の定義

public interface Figure {
	/**
	 * ・図形描画機能の定義
	 * 
	 */
	void draw();

	/**
	 * ・長さ測定機能の定義
	 * @return 長さ
	 */
	double getPerimeter();
}