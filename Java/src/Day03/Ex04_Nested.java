package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정보처리기사 합격 기준
		//(조건) 4학년, 60점 이상
		System.out.println("학년 : ");
		int year = sc.nextInt();
				
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		if(year == 4 && score >= 60) 
			System.out.print("합격");
		else if(year == 4)
			System.out.println("불합격");
		else
			System.out.println("응시자격 미달");
			
			
		//조건문을 중첩하지 않고 조건을 작성할 수 있다.
		
		sc.close();
		
	}

}
