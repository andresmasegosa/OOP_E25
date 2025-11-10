package session8.b_customexceptions;

public class BankAccount {
    private int balance;
    private int depositLimit = 1_000_000;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setDepositLimit(int depositLimit) {
        this.depositLimit = depositLimit;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new NegativeWithdrawException();
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new NegativeDepositException();
        }

        if (amount >= depositLimit) {
            throw new WarningLargeDeposit(amount,depositLimit);
        }
        balance=balance+amount;
    }
}