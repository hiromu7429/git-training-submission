package kadai;

public class Main {
	public static void main(String[] args) {

		int number = new java.util.Scanner(System.in).nextInt();
		if (number == 0) {
			Circle c = new Circle(100, 100, 20);
			c.draw();
			System.out.println(c.getPerimeter());

		} else if (number == 2) {
			Line l = new Line(0, 0, 100, 100);
			l.draw();
			System.out.println(l.getPerimeter());
		} else if (number == 3) {
			Triangle t = new Triangle(0, 0, 100, 100, 0, 200);
			t.draw();
			System.out.println(t.getPerimeter());
			System.out.println(t.getInternalAngle());
		} else if (number == 4) {
			Rectangle e = new Rectangle(0, 0, 100, 50);
			e.draw();
			System.out.println(e.getPerimeter());
			System.out.println(e.getInternalAngle());
		} else if (number == 44) {
			Square s = new Square(0, 0, 200);
			s.draw();
			System.out.println(s.getPerimeter());
			System.out.println(s.getInternalAngle());
		}
	}
}
