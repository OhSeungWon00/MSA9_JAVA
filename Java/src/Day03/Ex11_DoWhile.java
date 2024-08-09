package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		//메뉴판
		//*변수 선언 : 메뉴 번호, 메뉴 이름
		
		int menuNo = 0;   			  //입력받을 메뉴 번호
		int count = 0;    			  //메뉴 호출 수 카운팅
		String menuname = "";		  //메뉴이름 변수 초기화
		Scanner sc = new Scanner(System.in);  //입력 객체 생성
		
		do {
		System.out.println(":::::::::::: 메뉴판 ::::::::::::::");
		System.out.println("1. 참치마요 삼각김밥");
		System.out.println("2. 굶음 ㅜㅜ");
		System.out.println("3. 진라면 매운맛");
		System.out.println("4. 와퍼");
		System.out.println("5. 마라탕");
		System.out.println("0. 종료");
		System.out.println("메뉴 번호 :");
		//메뉴 번호 입력
		menuNo = sc.nextInt();
		// * break는 가장 가까운 제어문만 탈출
		
		if(menuNo == 0 || menuNo > 6) break;
		switch (menuNo) {
		case 0: break;
		case 1: menuname = "참치마요 삼각김밥"; break;
		case 2: menuname = "굶음 ㅜㅜ"; break;
		case 3: menuname = "진라면 매운맛"; break;
		case 4: menuname = "와퍼"; break;
		case 5: menuname = "마라탕"; break;
		default: break;
			
		}
		
		System.out.println(menuname + "(을/를) 주문하였습니다.");
		
		count++;                    // 주문 개수 증가
		
	    } while(menuNo != 0);  		// 메뉴번호가 0 이면 DO while 문 빠져나오기
		
		
		System.out.println("메뉴판을 종료합니다.");
	
		System.out.println("총 " + count + "개의 메뉴를 주문하셨습니다.");
		
		sc.close();
	}
}

