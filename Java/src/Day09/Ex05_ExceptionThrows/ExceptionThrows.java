package Day09.Ex05_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {

			input();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요");
		}

	}

	public static void input() throws InputMismatchException {
		System.out.println("입력 : ");
		int input = sc.nextInt();
		System.out.println(input);
	}

}
