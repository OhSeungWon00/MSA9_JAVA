package JavaMission;

//���� 1���� 100���� �� ���� ����ϸ鼭, �ش� �� �� 3 �Ǵ� 6 �Ǵ� 9�� �ش��ϴ� ���
//�ش� ���� ��ſ� 3, 6, 9�� ���ԵǴ� ������ŭ ��*�� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Mission_03 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 100; i++) {
			
			if(i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
				System.out.println("*");
			}
			
			System.out.println(i)
			
		}
		
		
		

	}

}
