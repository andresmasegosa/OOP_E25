package session4.A_Vehicle_Hierarchy;

public class Ferrari extends Sportscar{

    public Ferrari() {
        super(450);
    }

    @Override
    public void goFast() {
        System.out.println("Going fast Ferrari");
    }
}
