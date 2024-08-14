package javamission;

import java.util.Scanner;

public class javamission_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];
		int arr2[] = new int[4];
		int h = 0;
		
		int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10 = 0;
		
		
		
		
		
		

		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("출장비  오만원  만원    오천원  천원    오백원   백원   오십원   십원    오원   일원");
		for (int i = 0; i < 4; i++) {

			int value = arr[i];
			
			int value1 = value / 50000; // 오만원
			int away = value % 50000;
			
			int value2 = away / 10000; // 만원
			int away2 = away % 10000;
			
			int value3 = away2 / 5000; // 오천원
			int away3 = away2 % 5000;
			
			int value4 = away3 / 1000; // 천원
			int away4 = away3 % 1000;
			
			int value5 = away4 / 500; // 오백원
			int away5 = away4 % 500;
			
			int value6 = away5 / 100; // 백원
			int away6 = away5 % 100;
			
			int value7 = away6 / 50; // 오십원
			int away7 = away6 % 50;
			
			int value8 = away7 / 10; // 십원
			int away8 = away7 % 10;
			
			int value9 = away8 / 5; // 오원
			int away9 = away8 % 5;
			
			int value10 = away9 / 1; // 일원
			int away10 = away9 % 1;
			
			
			int sum1 += value;
			
			
			
			
			
			
			
			
			
			//출력
			

			System.out.println(value + "  " + value1 + "     " + value2 + "     " + value3 + "       " + value4
					+ "       " + value5 + "     " + value6 + "     " + value7 + "     " + value8 + "      " + value9
					+ "      " + value10);
		}
		
		
		System.out.print("전체 화폐매수 :" );
		

	}

}
