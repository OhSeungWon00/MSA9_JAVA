package Day02;

import java.util.Scanner;

public class Ex08_Triangle {

	public static void main(String[] args) {
		//삼각형 넓이 : (밑변) x (높이) / 2
		//밑변과 높이를 입력 받아서 삼각형의 넓이를 계산하고 출력하시오.
		
		//1. 밑변과 높이를 입력받는다.
		//2. 밑변과 높이를 담을 변수를 선언한다.
		//3. 삼각형 넓이를 계산한다.
		//4. 결과를 출력한다.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("삼각형의 밑변과 높이를 입력하세요 넓이를 구해드리겠습니다 ㅎㅎ :");
//		
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		System.out.println((num * num2) / 2);
		
//		sc.close();
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("밑변 :");
//		double width = sc.nextDouble();
//		System.out.println("높이 :");
//		double height = sc.nextDouble();
//		
//		double area = width * height / 2;
//		
//		System.out.println("넓이 :" + area);
//		
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 밑변을 입력하세요 : ");
		double width = sc.nextDouble();
		
		System.out.println("삼각형의 높이를 입력하세요 : ");
		double height = sc.nextDouble();
		
		double area = width * height / 2;
		System.out.println("삼각형의 넓이는" + area + "입니다.");
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
