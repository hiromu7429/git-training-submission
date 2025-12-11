package chapter5.program1;

//営業
public class Sales extends Employee {

	public Sales(String name, String section) {
		super(name, section);

	}

	//週報返信・・・「週報の返信をした」と出力
	public void replyWeeklyReport() {
		System.out.println("「週報の返信をした」");
	}

	//面談組む（引数：エンジニア）・・・「{エンジニア.名前}の面談を組んだ」と出力
	public void scheduelMetting(Engineer eng) {
		System.out.println("「{" + eng.getName() + "}の面談を組んだ」");
	}

	//打ち合わせ・・・「新規の打ち合わせをした」と出力
	public void haveMeeting() {
		System.out.println("「新規の打ち合わせをした」");
	}

	//情報表示・・・「{名前}：{所属部署}」を出力する
	public void displayInfo() {
		String name = this.getName();
		String section = this.getName();

		System.out.println("「{" + name + "}:{" + section + "}」");
	}
}
