package chapter5.program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//BT/DE
public class BT {

	//会社名
	private String name;

	//従業員リスト
	private List<Employee> employees;

	//部署リスト
	private List<String> sections;

	public BT() {
		this.name = "BT";
		employees = new ArrayList<>();
		sections = new ArrayList<>();

		//今回は増えることがないのでコンストラクタ内に追加
		sections.add("人事");
		sections.add("営業");
		sections.add("エンジニア");
	}

	//従業員をリストに追加（従業員を作成）　人事クラスのみアクセス可能にする必要あり（パッケージ分ける？）
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	//従業員のリストをイテレータで呼び出して表示
	public void displayEmployeeInfo() {
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getName() + "/" + e.getSection());
			if (e instanceof Engineer eng) {
				System.out.println("/" + eng.getLanguage());
			}
		}
	}
}

/*
addEmployee従業員作成
displayEmployeeInfo従業員情報表示
displayInfo情報表示
interviewEmployee社員面接
calculateSalary給与計算
replyWeeklyReport週報返信
scheduleMeeting面談を組む
haveMeeting打合せ
startDevelopment開発実施
*/
