package session4.B_Multiple_Inheritance;

public class Porsche911 extends SportsCar {


    public Porsche911() {
        super(400);
    }

    @Override
    public boolean goFast() {
        if ( (this.speed+60) < this.maxSpeed)
            super.speed+=60;
        else
            super.speed=super.maxSpeed;

        return true;
    }
}
