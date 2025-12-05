package main9;

//剣を装備した勇者を生み出す
public class Main9_04 {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damege = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" +h.sword.name);
	}
}
