package session9.a_slides_strategy_pattern;

public class PensionFeeStrategy implements AccountFeeStrategy{
    @Override
    public double calculateFee() {
        return 0;
    }
}
