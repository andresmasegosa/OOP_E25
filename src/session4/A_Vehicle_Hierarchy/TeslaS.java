package session4.A_Vehicle_Hierarchy;

public class TeslaS extends Sportscar{

    public TeslaS(){
        super(350);
    }

    @Override
    public void goFast() {
        if ( (this.speed+50) < this.maxSpeed)
            super.speed+=50;
        else
            super.speed=super.maxSpeed;
    }
}
