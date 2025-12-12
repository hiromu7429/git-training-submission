package chapter5.program1;

public class Main {
	public static void main(String[] args) {
		BT bt = new BT();

		Sales s1 = new Sales("のび太", bt);
		bt.addEmployee(s1);
		s1.replyWeeklyReport();
		s1.scheduleMetting(new Engineer("じゃいあん", "Java", bt));
		s1.haveMeeting();
		s1.displayInfo();

		HumanResource h1 = new HumanResource("ミサト", bt);
		bt.addEmployee(h1);
		HumanResource hEmp = new HumanResource("シンジ", bt);
		h1.interviewEmployee(hEmp, true);
		Sales sEmp = new Sales("レイ", bt);
		h1.interviewEmployee(sEmp, false);
		Engineer eEmp = new Engineer("アスカ", "Java", bt);
		h1.interviewEmployee(eEmp, true);
		h1.calculateSalary();
		h1.displayInfo();

		Engineer e1 = new Engineer("さとし", "Java", bt);
		bt.addEmployee(e1);
		e1.startDevelopment();
		e1.displayInfo();

		bt.displayEmployeeInfo();
	}
}
