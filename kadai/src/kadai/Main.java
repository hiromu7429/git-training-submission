package kadai;

public class Main {
	public static void main(String[] args) {

		int number = new java.util.Scanner(System.in).nextInt();
		if (number == 0) {
			Circle c = new Circle(100, 100, 20);
		} else if (number == 2) {
			Line l = new Line(0, 0, 100, 100);
		} else if (number == 3) {
			Triangle t = new Triangle(0, 0, 100, 100, 0, 200);
		} else if (number == 4) {
			Rectangle e = new Rectangle(0, 0, 100, 50);
		} else if (number == 44) {
			Square s = new Square(0, 0, 200);
		}
	}
}
