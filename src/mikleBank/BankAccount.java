package mikleBank;

public class BankAccount implements IBankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int upToBalance) {
        balance = upToBalance + balance;

    }

    @Override
    public void withdraw(int downToBalance) {
        balance = balance-downToBalance;
    }

    @Override
    public void getBalance() {
       System.out.println("Текущий баланс " + balance + " руб");
    }
}
