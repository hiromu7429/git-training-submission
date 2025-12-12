package chapter5.program1;

//人事
public class HumanResource extends Employee {
	private BT bt;//人事は面接後に採用する（リストに追加する）人事クラス内にBTクラスを保持する必要あり

	public HumanResource(String name, BT bt) {//リストにアクセスするために、コンストラクタでBTクラスを呼び出す

		super(name, bt.getSections().get(0));
		this.bt = bt;//interviewEmployeeメソッドで呼び出すためにbtを定義
	}

	//社員面接
	public void interviewEmployee(Employee emp, boolean pass) {
		if (pass == true) {
			System.out.println(this.getName() + "が" + emp.getName() + "の面接を行い、結果は採用だった");

			bt.addEmployee(emp);
		} else {
			System.out.println(this.getName() + "が" + emp.getName() + "の面接を行い、結果は不採用だった");
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
