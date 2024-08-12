package Day05.Ex02_Calculator;

//계산기
// - 피연산자를 2개로 하는 계산기
// -기능
//         1. 덧셈 : 정수 2개를 덧셈
//         2. 뺄셈 : 정수 인자1 - 인자2 연산을 하는 뺄셈
//         3. 곱셈 : 실수 2개를 곱셈
//         4. 나눗셈 : 실수인자1 / 인자2 연산을 하는 나눗셈
//		   5. 나머지 : 실수인자1 % 인자2 연산을 하는 나머지 연산
//         6. 합계  : 배열로 매개변수를 전달받아, 모든 요소의 합을 구함
//         7. 평균  : 배열로 매개변수를 전달받아, 모든 요소의 평균을 구함

//			*메소드명
//			: plus, minus, multiple, divide, remain, sum, avg

public class Calculator {

	int plus;
	int minus;
	double multiple;
	double divide;
	int remain;
	int sum;
	double avg;

	public int plus(int a, int b) {// 덧셈
		int result = a + b;
		return result;
	}

	public int minus(int a, int b) {// 빨심
		int result = a - b;
		return result;
	}

	public double multiple(double x, double y) {// 곱셈
		double result = x * y;
		return result;
	}

	public double divide(double x, double y) {// 나눗셈
		double result = x / y;
		return result;
	}

	public double remain(int a, int b) {// 나머지
		int result = a % b;
		return result;
	}

	public int sum(int[] value) {// 배열 누적산
		int result = 0;

		for (int sum : value) {
			result += sum;
		}
		return result;
	}

	public double avg(int[] values) {// 배열 평균
		int result2 = 0;
		double result3 = 0.0;

		for (int sum : values) {

			result3 = sum(values) / values.length;
		}
		return result3;

	}

}
