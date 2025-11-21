package session9.a_slides_strategy_pattern;

public class BankAccount {
    private double balance;
    private InterestStrategy interestStrategy;
    private AccountFeeStrategy accountFeeStrategy;

    public BankAccount(double balance,
                       InterestStrategy interestStrategy,
                       AccountFeeStrategy accountFeeStrategy) {

        this.balance = balance;
        this.interestStrategy = interestStrategy;
        this.accountFeeStrategy = accountFeeStrategy;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;



    }
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }
    public void accrueInterest() {
        this.balance = this.balance + interestStrategy.getInterest(this.balance);
    }
    public void applyFee(){
        this.balance = this.balance - this.accountFeeStrategy.calculateFee();
    }


}
