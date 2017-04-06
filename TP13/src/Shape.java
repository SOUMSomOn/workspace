import java.awt.Point;

public class Shape {
	// Point p = new Point();
	Point p1;
	Point p2;
	Point p3;
	Point p4;

	public Shape(Point p1) {
		this.p1 = p1;
	}

	public Shape(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Shape(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Shape(Point p1, Point p2, Point p3, Point p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public static void main(String[] args) {
		System.out.print("Unknown");
	}
}
