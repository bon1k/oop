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
    public int withdraw(int downToBalance) {
        balance = balance-downToBalance;
        return balance;
    }

    @Override
    public int getBalance() {
       System.out.println("Текущий баланс " + balance + " руб");
       return balance;
    }
}
