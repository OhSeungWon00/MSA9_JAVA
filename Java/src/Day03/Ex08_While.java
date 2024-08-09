package Day03;

public class Ex08_While {

	public static void main(String[] args) {
		//1 ~ 10 까지 공백을 두고 출력하시오.
//		
//		System.out.println(1 + "");
//		System.out.println(2 + "");
//		System.out.println(3 + "");
//		System.out.println(4 + "");
//		System.out.println(5 + "");
//		System.out.println(6 + "");
//		System.out.println(7 + "");
//		System.out.println(8 + "");
//		System.out.println(9 + "");
//		System.out.println(9 + "");
		
		
		int a = 1;
		
		
		//while(조건) {반복 실행문)
		//반복문에는 반드시 종료조건이 성립하도록 작성해야한다.
		//종료 안될 시 무한 루프에 빠짐
		
		while(a < 11) {
			System.out.print(a++ + " ");
			
			// a = a + 1;
			// a += 1;
			//a++;
		}
		
	}

}







