package test;

import java.util.Scanner;

public class JavaMission_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 게임? ");

		int arr[] = new int[6];

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("[" + i + "게임" + "] :");
			for (int j = 0; j < 6; j++) {
				arr[j] = (int) (Math.random() * 45 + 1);
				
				System.out.print(arr[j] + " ");

			}
			System.out.println();

		}

		}
	}

