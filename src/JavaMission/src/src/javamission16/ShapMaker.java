package javamission16;

import java.util.Scanner;

public class ShapMaker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double radius;
		double weight;
		double height;

		Shape[] shapeList = new Shape[3];
		int index = 0;

		while (true) {
			if (index == 3)
				break;

			System.out.println("1. 삼각형\t 2. 사각형 3. 원");
			System.out.println(">>");
			String input = sc.next();

			if (input.equals("그만"))
				break;

			switch (input) {

			case "1":
				// 삼각형
				System.out.println("가로 :");
				weight = sc.nextDouble();
				System.out.println("세로 :");
				height = sc.nextDouble();
				shapeList[index++] = new Triangle(weight, height);
				break;

			case "2":
				// 사각형
				System.out.println("가로 :");
				weight = sc.nextDouble();
				System.out.println("세로 :");
				height = sc.nextDouble();
				shapeList[index++] = new Rectangle(weight, height);
				break;

			case "3":
				// 원
				System.out.println("반지름 :");
				radius = sc.nextDouble();
				shapeList[index++] = new Circle(radius);
				break;

			}

		}

		// 넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;

		for (Shape shape : shapeList) {
			// 넓이와 둘레
			double area = shape.area();
			double round = shape.round();

			// 합계
			areaSum += area;
			roundSum += round;

			// instanceof : 인스턴스를 비교하는 연산
			if (shape instanceof Triangle)
				System.out.println("삼각형");
			if (shape instanceof Rectangle)
				System.out.println("사각형");
			if (shape instanceof Circle)
				System.out.println("원형");

			System.out.println("넓이 : " + area + "\t");
			System.out.println("둘레 : " + round + "\t");
			System.out.println();

		}

		System.out.println("넓이 총합 :" + areaSum);
		System.out.println("둘레 총합 :" + roundSum);

		sc.close();

	}

}
