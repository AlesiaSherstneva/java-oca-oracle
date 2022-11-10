package lesson5;

@SuppressWarnings("unused")
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
