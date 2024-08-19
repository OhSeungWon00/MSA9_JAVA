package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력 변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0;

		// 입력받은 도형 배열 (3개)
		Shape[] shapeList = new Shape[3];
		int index = 0;

		while (true) {
			if (index == 3)
				break;

			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.println(">>");
			String input = sc.next();

			if (input.equals("그만"))
				break;

			// 도형 선택
			switch (input) {
			// 삼각형
			case "1":
				System.out.println("가로 :");
				width = sc.nextDouble();
				System.out.println("세로 : ");
				height = sc.nextDouble();
				shapeList[index] = new Triangle(width, height);
				break;
				
			// 사각형
			case "2":
				System.out.println("가로 :");
				width = sc.nextDouble();
				System.out.println("세로 : ");
				height = sc.nextDouble();
				shapeList[index] = new Rectangle(width, height);
				break;

			// 원형

			case "3":
				System.out.println("반지름 :");
				radius = sc.nextDouble();
				shapeList[index] = new Circle(radius);
				break;
				

			}

		}

		sc.close();

	}

}
