package session9.b_slides_observer_pattern;

public class SkatMonitor implements AccountListener{


    @Override
    public void notify(double newBalance, double oldBalance) {
        double diff = newBalance - oldBalance;
        if (diff>1_500_000)
            System.out.println("Very large deposit!!!!!!");
    }
}
