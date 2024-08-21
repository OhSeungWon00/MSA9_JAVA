package javamission16;

public class Triangle extends Shape {

	double weight, height;

	public Triangle() {

	}

	public Triangle(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	@Override
	double area() {
		return weight * height / 2; // 삼각형 넓이 세부 구현
	}

	@Override
	double round() { // 삼각형 둘레 세부 구현
		return 3 * weight;
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
		return "Triangle [weight=" + weight + ", height=" + height + "]";
	}

}
