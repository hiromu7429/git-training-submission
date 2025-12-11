package chapter5.program1;

//人事
public class HumanResource extends Employee {

	public HumanResource(String name, String section) {
		super(name, section);

	}

	//社員面接
	public void interviewEmployee(boolean interview) {
		if (interview == true) {
			System.out.println("面接を行い、結果は採用だった");
			//採用の場合の処理は後で考える（処理の記述が未完了）
			//BTクラスのリストへ追加するメソッドを呼び出して追加する
		} else {
			System.out.println("面接を行い、結果は不採用だった");
		}
	}

	//給与計算
	public void calculateSalary() {
		//このメソッドは一旦このまま
	}

	//情報表示・・・「{名前}：{所属部署}」を出力する
	public void displayInfo() {
		String name = this.getName();
		String section = this.getSection();

		System.out.println("「{" + name + "}:{" + section + "}」");

	}
}
