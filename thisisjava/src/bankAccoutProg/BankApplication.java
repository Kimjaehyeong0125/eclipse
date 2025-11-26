package bankAccoutProg;

import java.util.Scanner;

public class BankApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accountArray = new Account[100];

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            System.out.println("========================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("========================================");
            System.out.print("선택> ");

            String input = scanner.nextLine();
            int selectNo;

            try {
                selectNo = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
                continue;
            }

            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("1~5 사이 숫자를 선택하세요.");
            }
        }
    }

    private static void createAccount() {
        System.out.println("[계좌생성]");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        if (findAccount(ano) != null) {
            System.out.println("이미 존재하는 계좌번호입니다.");
            return;
        }

        System.out.print("예금주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance;
        try {
            balance = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("금액은 숫자로 입력하세요.");
            return;
        }

        Account newAccount = new Account(ano, owner, balance);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                return;
            }
        }

        System.out.println("더 이상 계좌를 생성할 수 없습니다.");
    }

    private static void accountList() {
        System.out.println("[계좌목록]");

        boolean hasAccount = false;
        for (Account account : accountArray) {
            if (account != null) {
                System.out.println("----------------------------------------");
                System.out.println("계좌번호: " + account.getAno());
                System.out.println("예금주: " + account.getOwner());
                System.out.println("잔액: " + account.getBalance());
                hasAccount = true;
            }
        }
        if (!hasAccount) {
            System.out.println("등록된 계좌가 없습니다.");
        }
    }

    private static void deposit() {
        System.out.println("[예금]");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("예금액: ");
        int amount;
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("금액은 숫자로 입력하세요.");
            return;
        }

        if (amount <= 0) {
            System.out.println("0보다 큰 금액을 입력하세요.");
            return;
        }

        account.deposit(amount);
        System.out.println("예금이 완료되었습니다. 현재 잔액: " + account.getBalance());
    }

    private static void withdraw() {
        System.out.println("[출금]");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("출금액: ");
        int amount;
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("금액은 숫자로 입력하세요.");
            return;
        }

        if (amount <= 0) {
            System.out.println("0보다 큰 금액을 입력하세요.");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("출금이 완료되었습니다. 현재 잔액: " + account.getBalance());
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + account.getBalance());
        }
    }

    private static Account findAccount(String ano) {
        for (Account account : accountArray) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
