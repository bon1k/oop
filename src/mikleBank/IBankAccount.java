package mikleBank;

public interface IBankAccount {

    void deposit(int upToBalance);

    void withdraw(int downToBalance);

    void getBalance();

}
