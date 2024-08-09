package Day02;

import java.util.Scanner;

public class Ex09_Circle {

	public static void main(String[] args) {
		
		//상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값을 지정
		// * 상수 선언 시, 반드시 값을 초기화해야한다.
		// * 선언 이후에 값을 변경할 수 없다.
		// - 키워드 : final 
		
		final double PI = 3.141592;
//	(에러)	PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		//원의 넓이 : 반지름 * 반지름 * 3.14
		System.out.println("반지름 :");
		double radius = sc.nextDouble();
		//double area = PI * radius * radius;
		double area = PI * Math.pow(radius, 2);  // 제곱 수 메서드
		
		
		
		System.out.println("원의 넓이 :" + area);
		sc.close();
				
	}
	
	

}
