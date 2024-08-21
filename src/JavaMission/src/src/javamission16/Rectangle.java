package javamission16;

public class Rectangle extends Shape {

	double weight, height;

	public Rectangle() {
	}

	public Rectangle(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	@Override
	double area() { // 사각형 넓이 세부정의
		return weight * height;
	}

	@Override
	double round() { // 사각형 둘레 세부정의
		return (weight + height) * 2;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [weight=" + weight + ", height=" + height + "]";
	}

}
