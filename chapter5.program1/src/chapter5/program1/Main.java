package chapter5.program1;

public class Main {
	public static void main(String[] args) {
		BT bt = new BT();

		bt.addEmployee(new Engineer("すずき","","Java"));
		bt.addEmployee(new Engineer("たなか", "エンジニア ", "Java"));
		bt.addEmployee(new Sales("たんじろう", ""));
		bt.addEmployee(new HumanResource("さかもと", ""));

		bt.displayEmployeeInfo();

		Sales s1 = new Sales("のび太", "営業");
		s1.replyWeeklyReport();
		s1.scheduelMetting(new Engineer("しょうじ", "エンジニア ", "Java"));
		s1.haveMeeting();
		s1.displayInfo();

		HumanResource h1 = new HumanResource("かるべ", "人事");
		//h1.interviewEmployee();要確認 BTのリストへ追加するメソッドを呼び出す
		//h1.calculateSalary();要確認　給与計算
		h1.displayInfo();

		Engineer e1 = new Engineer("たかはし", "エンジニア", "Java");
		e1.startDevelopment();
		e1.displayInfo();
	}
}
