package chapter5.program1;

public class Main {
	public static void main(String[] args) {
		BT bt = new BT();

		bt.addEmployee(new Engineer("すずき", "エンジニア ", "Java"));
		bt.addEmployee(new Engineer("たなか", "エンジニア ", "Java"));
		bt.addEmployee(new Sales("すずき", "人事"));

		bt.displayEmployeeInfo();

	}
}
