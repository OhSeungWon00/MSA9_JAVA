package JavaMission;

//���� N�� �Է� �޾�, N�� N���� 2���� �迭�� �����Ͻÿ�. �׸��� �迭����� 1���� 1�� �����ϴ� ���� ������� ������
//�鼭 1 ���� ������ ������ �迭��ҿ� �����ϴ� ������ �ݴ�� �Ͽ� ���� �����ϰ� ����Ͻÿ�


import java.util.Scanner;

public class Mission_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[][] = new int[a][a]; // 2���� �迭 �ʱ�ȭ
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