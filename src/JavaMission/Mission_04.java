package JavaMission;

//정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고, 

//예시 <출력>과 같이 “*” 기호를 출력하는 프로그램을 작성하시오
//*
//***
//*****
//*******
//*********

import java.util.Scanner;

public class Mission_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n * 2; i += 2) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
