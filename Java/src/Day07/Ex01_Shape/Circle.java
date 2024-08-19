package Day07.Ex01_Shape;

public class Circle extends Shape {

	double radius; // 반지름

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// 원의 넓이
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		// 원의 둘레
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
