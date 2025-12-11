package chapter5.program1;

//エンジニア
public class Engineer extends Employee {

	//使用言語・・・使用している言語（java, pythonなど）
	private String language;

	public Engineer(String name, String section, String language) {
		super(name, "エンジニア");
		this.language = language;
	}

	//開発実施・・・「{使用言語}で開発を行なった」と出力
	public void startDevelopment() {
		System.out.println("「{" + this.language + "}で開発を行った」");
	}

	//情報表示・・・「{名前}：{所属部署}　使用言語：{使用言語}」と出力
	public void displayInfo() {
		String name = this.getName();
		String section = this.getSection();

		System.out.println("「{" + name + "}:{" + section + "}　使用言語:{" + this.language + "}」");
	}

	public String getLanguage() {
		return this.language;
	}

	public void setName(String language) {
		this.language = language;
	}

}
