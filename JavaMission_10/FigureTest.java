package JavaMission_10;

public class FigureTest {
public static void main(String[] args) {
Triangle triangle = new Triangle(10, 20);
Rectangle ractangle = new Rectangle(10, 20);
Circle circle = new Circle(5);
Trapezoid trapezoid = new Trapezoid(5, 10, 8);
System.out.println("�ﰢ���� ���� : " + triangle.getArea());
System.out.println("�簢���� ���� : " + ractangle.getArea());
System.out.println("������ ���� : " + circle.getArea());
System.out.println("��ٸ����� ���� : " + trapezoid.getArea());
}
}
