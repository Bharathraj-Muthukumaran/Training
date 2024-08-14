package Day4;

class Shape {
    double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    double l,w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double getArea() {
        return l * w;
    }
}
public class rectangle_program {
	public static void main(String[] args) {
		Rectangle r  = new Rectangle(6,7);
		System.out.println("Area: " + r.getArea());
	}

}
