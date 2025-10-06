package session4.A_Vehicle_Hierarchy;

public abstract class Sportscar implements Vehicle {
    protected int speed=0;
    protected int maxSpeed=0;

    public Sportscar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    public abstract void goFast();

}