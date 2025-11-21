package session9.b_slides_observer_pattern;

public class CustomerSatisfactionDepartment implements AccountListener{
    @Override
    public void notify(double newBalance, double oldBalance) {
        System.out.println("Hi");
    }
}
