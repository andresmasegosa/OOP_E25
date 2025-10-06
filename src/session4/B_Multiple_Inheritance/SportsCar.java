package session4.B_Multiple_Inheritance;

public abstract class SportsCar implements Vehicle {
    protected int speed=0;
    protected int maxSpeed=0;


    public SportsCar(int speed) {
        this.speed = speed;
    }

    public int speed() {
        return speed;
    }

    public abstract boolean goFast();
}
