package javamission16;

public class Circle extends Shape {

	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() { // 원 넓이 세부구현
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		return Math.PI * 2 * radius; // 원의 둘레 세부구현
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
