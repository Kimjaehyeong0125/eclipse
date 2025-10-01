package hw.sec01;

import java.util.Scanner;

public class BankHw01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("예금액 입력: ");
        int depositAmount = Integer.parseInt(scanner.nextLine());

        System.out.print("출금액 입력: ");
        int withdrawAmount = Integer.parseInt(scanner.nextLine());

        boolean run = true;
        int account = 0; // 초기 잔고

        while(run) {
            System.out.println("----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------");
            System.out.print("선택: ");

            String strNum = scanner.nextLine(); // 메뉴 선택

            if(strNum.equals("1")) { // 예금
                account += depositAmount;
                System.out.println("예금액=" + depositAmount);

            } else if(strNum.equals("2")) { // 출금
                if(account >= withdrawAmount) {
                    account -= withdrawAmount;
                    System.out.println("출금액=" + withdrawAmount);
                } else {
                    System.out.println("잔액 부족!");
                }

            } else if(strNum.equals("3")) { // 잔고 조회
                System.out.println("잔고=" + account);

            } else if(strNum.equals("4")) { // 종료
                run = false;

            } else {
                System.out.println("잘못된 입력입니다. 1~4 중에서 선택하세요.");
            }
        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}

