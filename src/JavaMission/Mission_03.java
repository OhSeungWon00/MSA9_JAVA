package JavaMission;

//정수 1부터 100까지 의 수를 출력하면서, 해당 수 가 3 또는 6 또는 9에 해당하는 경우
//해당 정수 대신에 3, 6, 9가 포함되는 개수만큼 “*” 를 출력하는 프로그램을 작성하시오.

public class Mission_03 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 100; i++) {
			
			if(i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
				System.out.println("*");
			}
			
			System.out.println(i)
			
		}
		
		
		

	}

}
