package JavaMission;

import java.util.Scanner;

public class Mission_11_Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		Mission_11_Account abc = null; // 초기 변수 선언

		System.out.println("====================================");

		do {
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("====================================");
			System.out.print("입력>>");
			n = sc.nextInt();

			switch (n) {

			case 1:
				System.out.print("계좌번호>>");
				String moneynum = sc.next();
				System.out.print("예금주>>");
				String name = sc.next();
				System.out.print("최초예금액>>");
				int money = sc.nextInt();
				System.out.print("비밀번호>>");
				int password = sc.nextInt();

				abc = new Mission_11_Account(moneynum, name, money, password);

				System.out.println("'" + name + "'" + "님의 계좌가 개설되었습니다");
				break;

			case 2:
				if (abc != null) {
					System.out.println("================= 입금 =================");
					System.out.println("계좌번호>>" + abc.getMoneynum());
					System.out.print("입금액>>");
					int i = sc.nextInt();

					System.out.println(abc.getName() + "님에게 입금하는게 맞으십니까?");
					System.out.println("1. 예");
					System.out.println("2. 아니오");
					System.out.print("입력>>");
					int k = sc.nextInt();
					if (k == 1) {
						abc.setMoney(i);
						System.out.println(abc.getName() + "님에게 " + i + " 원이 입금되었습니다.");
					} else {
						System.out.println("입금이 취소되었습니다");
					}
				} else {
					System.out.println("먼저 계좌를 등록해주세요.");
				}
				break;

			case 3:
				if (abc != null) {
					System.out.println("계좌번호>>" + abc.getMoneynum());
					System.out.println("비밀번호>>");
					int z = sc.nextInt();
					if (z != abc.getPassword()) {
						System.out.println("비밀번호가 다릅니다.");
						break;
					}
					System.out.println("출금액>> ");
					int a = sc.nextInt();
					abc.setMoney2(a);
					System.out.println(abc.getName() + "님의 계좌에 " + a + "원이 출금되었습니다.");
				} else {
					System.out.println("먼저 계좌를 등록해주세요.");
				}
				break;

			case 4:
				if (abc != null) {
					System.out.println("================= 계좌조회 =================");
					System.out.println("계좌번호>>" + abc.getMoneynum());
					System.out.println("비밀번호>>");
					int v = sc.nextInt();
					if (v != abc.getPassword()) {
						System.out.println("비밀번호가 다릅니다.");
						break;
					}
					System.out.println(abc.getName() + "님의 계좌잔액은 " + abc.getMoney() + "원 입니다.");
				} else {
					System.out.println("먼저 계좌를 등록해주세요.");
				}
				break;

			case 5:
				System.out.println("관리자 비밀번호>>");
				int h = sc.nextInt();
				System.out.println("================= 계좌목록 =================");
				System.out.println("예금주 \t계좌번호\t잔고");
				System.out.println(abc.getName() + "\t" + abc.getMoneynum() + "\t" + abc.getMoney() );
				break;

			}

		} while (n != 6);
		
			System.out.println("시스템을 종료합니다.");
		

	}
}
