package JavaMission;

//���� �ϳ��� �Է� �޾�, ������ ���� N�� �ʱ�ȭ��Ű��, 

//���� <���>�� ���� ��*�� ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
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
