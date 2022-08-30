package mikleBank;

public interface IBankAccount {

    void deposit(int upToBalance);

    int withdraw(int downToBalance);

    int getBalance();

}
