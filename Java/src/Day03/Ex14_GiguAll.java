package Day03;

public class Ex14_GiguAll {

	public static void main(String[] args) {
		// 구구단 전체 출력
		// 단에 대한 반복 : 1~9
		// 각 단의 곱 : 1~9

		// 중첩 반복문(이중 반복문)
		// A X B

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
			System.out.println();

		}

	}

}
