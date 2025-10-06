package session4.A_Vehicle_Hierarchy;

public class Porsche911 extends Sportscar{

    public Porsche911(){
        super(400);
    }

    @Override
    public void goFast() {
        if ( (this.speed+60) < this.maxSpeed)
            super.speed+=60;
        else
            super.speed=super.maxSpeed;
    }
}
