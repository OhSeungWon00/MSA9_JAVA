package JavaMission_10;

public class Circle {
	
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circl [radius=" + radius + "]";
	}

	public double getArea() {
		return (radius * radius)*Math.PI;
	}
	
	

}
