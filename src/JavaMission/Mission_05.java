package JavaMission;

import java.util.Scanner;

public class Mission_05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num; 
        int count = 0;
        
        do {
            System.out.println("********** ġŲ �޴��� **********");
            System.out.println("1.   Ȳ�ݿø��� �ݹ��� ġŲ");
            System.out.println("2.   ����Ŭ ġŲ");
            System.out.println("3.   ó�������� ȣ���̰� ���� ġŲ");
            System.out.println("0.   ����");
            System.out.print("************ ��ȣ :");
            num = sc.nextInt();
            System.out.println();
            
            
            switch(num) {
                case 1 : 
                    System.out.println("'Ȳ�ݿø��� �ݹ��� ġŲ'��(/��) �ֹ��Ǿ����ϴ�"); 
                    System.out.println();
                    break;
                case 2 : 
                    System.out.println("'����Ŭ ġŲ'��(/��) �ֹ��Ǿ����ϴ�"); 
                    System.out.println();
                    break;
                case 3 : 
                    System.out.println("'ó�������� ȣ���̰� ���� ġŲ'��(/��) �ֹ��Ǿ����ϴ�"); 
                    System.out.println();                    
                    break;
                case 0 : 
                    System.out.println("�� " + count + "���� ��ǰ�� �ֹ��Ǿ����ϴ�."); 
                    System.out.println();
                    break;
                default:
                    System.out.println("0 ~ 3 ������ ��ȣ�� �Է��� �ּ��� ");
                    System.out.println();
                    break;
            }
            count++;
            
        } while(num != 0);
        
        sc.close(); // Scanner �ݱ�
    }
}
