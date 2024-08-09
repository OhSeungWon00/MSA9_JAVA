package Day01;

import java.util.Scanner;

//import : 외부 클래스 포함시키는 키워드
// *import 패키지.클래스명;



//import 하는 법
//1. 클래스  : ctrl + space
//2. 클래스 전체 import  : ctrl + shift + o

public class Ex03_Scanner {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		
		System.out.println("나이는 : " + age + "살 입니다.");
		
		sc.close();
		//close() : Scanner 객체를 메모리에서 해제하는 메소드
		
		sc.nextInt();
		// *Scanner 객체를 해제한 이후는 더이상 입력 받을 수 없다.
		
		
		
		

	}

}
