package JavaMission;

import java.util.Scanner;

//���� �ϳ��� �Է� �޾�, ������ ���� N�� �ʱ�ȭ��Ű��, ���� 1���� N���� Ȧ���� �հ�� ¦���� �հ� �׸��� ���� N�� ��

//���� ���Ͽ� ���� <���>�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ( 1 �� N �� 100 )
//
//1+3+5+7+9=25
//2+4+6+8+10=30
//1 2 5 10

public class Mission_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		int value = 1;
		int sum = 0;

		for (int i = 1; i < arr.length; i++) {

			arr[i] = value;
			value += 2;

			if (value <= n) {
				System.out.print(arr[i] + "+");
				sum += value;

			} else {
				System.out.println(arr[i] + "=" + (sum + 1));
				break;

			}

		}

		int value2 = 2;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = value2;
			value2 += 2;

			if (value2 <= n) {
				System.out.print(arr[i] + "+");
				sum2 += value2;

			} else {
				System.out.println(arr[i] + "=" + (sum2 + 2));
				break;

			}

		}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}

		}

	}
}
