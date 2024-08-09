package Day03;

public class Ex10_OddEven {

	public static void main(String[] args) {
		
		//1 ~ 20 까지 정수 중
		//홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1+3+5+7........,   2+4+6+8.......
		
		int a = 1;
		int b = 0;
		int sum1 = 0;
		int sum2 = 0;
				
		
		while(a < 21) {
			 sum1 += a;
			 a += 2;
			 System.out.println(sum1);
		}
		System.out.println("홀수의 합계 : " + sum1);
		
		
		
		while(b < 21) {
			 sum2 += b;
			 b += 2;
			 System.out.println(sum2);
	}
		System.out.println("짝수의 합계 : " + sum2);

}
}
