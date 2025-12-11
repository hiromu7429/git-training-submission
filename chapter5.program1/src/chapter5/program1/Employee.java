package chapter5.program1;

//従業員
public abstract class Employee {

	//従業員の名前
	private String name;

	//所属している部署名
	private String section;

	//nullで初期化
	public Employee() {
		this.name = null;
		this.section = null;
	}

	//引数を代入
	public Employee(String name, String section) {
		this.name = name;
		this.section = section;
	}

	//情報表示の抽象メソッド
	public abstract void displayInfo();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}
