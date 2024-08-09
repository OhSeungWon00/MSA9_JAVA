package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		// 반복문으로 구구단 만들기

		System.out.println("원하는 단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		for (int a = 1; a <= 9; a++) {
			if (i < 10) {
				System.out.println(i + "*" + a + "=" + a * i);
			}

			else if (i > 10) {
				System.out.println("구구단이 아닙니다.");
				break;
			}

		}
	}

}
