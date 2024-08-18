package JavaMission;

import java.util.Random;
import java.util.Scanner;

public class Mission_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 게임?");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 1; i <= arr.length; i++) {
			System.out.print("[" + i + "게임] : ");
			for (int j = 0; j < 6; j++) {
				System.out.print((int) (Math.random() * 45) + 1 + " ");
			}
			System.out.println();
		}


	}
}

