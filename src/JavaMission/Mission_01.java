package JavaMission;

import java.util.Scanner;

//�л��� ����, ����, �ڹ� ������ ���� ������ ���� eng, math, java �� �����ϰ�, ������� ������ �Է� �޾� ������ �� ��
//��� ����� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//���� ���� : 80
//���� ���� : 90
//�ڹ� ���� : 100
//���� : 270
//��� : 90.0

public class Mission_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		double average = (eng + math + java) / 3;

		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		System.out.println("�ڹ� ���� : " + java);
		System.out.println("���� : " + (eng + math + java));
		System.out.printf("��� : %.1f", average);

	}

}
