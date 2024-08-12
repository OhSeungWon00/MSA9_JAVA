package JavaMission;

import java.util.Scanner;

public class Mission_05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num; 
        int count = 0;
        
        do {
            System.out.println("********** 치킨 메뉴판 **********");
            System.out.println("1.   황금올리브 반반한 치킨");
            System.out.println("2.   뿌잉클 치킨");
            System.out.println("3.   처갓집에서 호식이가 만든 치킨");
            System.out.println("0.   종료");
            System.out.print("************ 번호 :");
            num = sc.nextInt();
            System.out.println();
            
            
            switch(num) {
                case 1 : 
                    System.out.println("'황금올리브 반반한 치킨'이(/가) 주문되었습니다"); 
                    System.out.println();
                    break;
                case 2 : 
                    System.out.println("'뿌잉클 치킨'이(/가) 주문되었습니다"); 
                    System.out.println();
                    break;
                case 3 : 
                    System.out.println("'처갓집에서 호식이가 만든 치킨'이(/가) 주문되었습니다"); 
                    System.out.println();                    
                    break;
                case 0 : 
                    System.out.println("총 " + count + "개의 상품이 주문되었습니다."); 
                    System.out.println();
                    break;
                default:
                    System.out.println("0 ~ 3 사이의 번호를 입력해 주세요 ");
                    System.out.println();
                    break;
            }
            count++;
            
        } while(num != 0);
        
        sc.close(); // Scanner 닫기
    }
}
