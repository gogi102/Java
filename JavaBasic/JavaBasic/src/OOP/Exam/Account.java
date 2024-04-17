package OOP.Exam;

public class Account {
    int balance;
    int amount;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("잔액 부족");
        }
    }
}
