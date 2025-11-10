package session8.b_customexceptions;

public class WarningLargeDeposit extends RuntimeException {
    private int limit=1_000_000;
    private int amount;

    public WarningLargeDeposit(int amount, int limit) {
        this.amount=amount;
        this.limit=limit;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String getMessage() {
        return "Amount is too large.";
    }
}
