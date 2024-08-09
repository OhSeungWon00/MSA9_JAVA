package Day03;

public class Ex09_WhileSum {

	public static void main(String[] args) {
		//1부터 1000까지 합계를 구하시오
		//1+2+3+......???
		
		int a = 1;
		int sum = 0;
		
		while(a <= 10000) {
			sum += a++;
		}
		System.out.println(sum);
	}
}
