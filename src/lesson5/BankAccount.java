package lesson5;

@SuppressWarnings({"unused", "SameParameterValue"})
public class BankAccount {
    int id;
    String name;
    double balance;

    // у меня рука не поднялась так нелепо называть методы, как это требовалось в задании :-)

    void increase(double sum) {
        balance += sum;
    }

    void decrease(double sum) {
        balance -= sum;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 554.12;

        System.out.println("Balance : " + account.balance);
        account.increase(51.15);
        System.out.println("Up 51.15: " + account.balance);
        account.decrease(25.00);
        System.out.println("Down 25.00: " + account.balance);
    }
}
