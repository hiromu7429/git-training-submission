package main11;

//継承の材料をnewして利用されてしまう
public class Main11_06 {
	public static void main(String[] args) {
		Character c = new Character();
		Matango m = new Matango('A');
		c.attack(m);
	}

}
