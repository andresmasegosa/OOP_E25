package session9.exercises.a_exercise_strategy_pattern;

import session9.exercises.a_exercise_strategy_pattern.payments_apis.PayPal;

public class PaymentByPaypal implements PaymentMethod {

    private PayPal payPal;

    public PaymentByPaypal(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public boolean pay(double quantity) {
        return payPal.processPayment(quantity);
    }
}
