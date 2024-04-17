package OOP.Exam;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);

        ac.deposit(10000);
        ac.withdraw(9000);
        ac.withdraw(2000);
        System.out.println("잔고 :"+ac.balance);

    }

}
