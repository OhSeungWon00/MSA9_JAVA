package JavaMission;

//정수 N을 입력 받아, N행 N열의 2차원 배열을 선언하시오. 그리고 배열요소의 1부터 1씩 증가하는 값을 순서대로 저장하
//면서 1 행이 증가할 때마다 배열요소에 접근하는 방향을 반대로 하여 값을 저장하고 출력하시오


import java.util.Scanner;

public class Mission_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[][] = new int[a][a]; // 2차원 배열 초기화
		int value = 1;

		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a; j++) {
					arr[i][j] = value++;
				}
			} else {
				for (int j = a - 1; j >= 0; j--) {
					arr[i][j] = value++;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}