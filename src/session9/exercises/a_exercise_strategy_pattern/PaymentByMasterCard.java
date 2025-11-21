package session9.exercises.a_exercise_strategy_pattern;

import session9.exercises.a_exercise_strategy_pattern.payments_apis.MasterCard;

public class PaymentByMasterCard implements PaymentMethod {

    private MasterCard masterCard;

    public PaymentByMasterCard(MasterCard masterCard) {
        this.masterCard = masterCard;
    }

    @Override
    public boolean pay(double quantity) {
        return masterCard.chargeToTheCreditCard(quantity);
    }
}
