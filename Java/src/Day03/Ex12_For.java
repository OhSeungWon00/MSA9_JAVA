package Day03;

public class Ex12_For {
	public static void main(String[] args) {
//	 for(초기식; 조건식; 증감식  ) { }
//	 실행순서 : 1 -> 반복 (2 - 3 - 4)
//		 1 ~ 10까지의 정수를 출력하시오
		
		for (int i = 0; i <= 10;i++) {
				System.out.print(i + " ");
				
			}
		System.out.println(" ");
			
	    for (int j = 0; j <= 50; j++) {
				System.out.print(j + " ");
				
			}
	    System.out.println(" ");
		
		for (int k = 50; k <= 100; k++) {
			System.out.print(k + " ");	
			
		}
		System.out.println(" ");
		
		for (int q = 2; q < 20; q = q + 2) {
			System.out.print(q + " ");
		
			}
		for (int b = 1; b <= 19; b += 2) {
			System.out.print(b + " ");
		
		}	
	}
}




