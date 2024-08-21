package javamission16;

public abstract class Shape {

	Point point;

	abstract double area(); // 넓이와 둘레 구하는 메소드 정의

	abstract double round();
	
	
	
	
	

	public Point getPoint() {          //getter, setter 메소드 정의 
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
