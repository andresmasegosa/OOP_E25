package session4.A_Vehicle_Hierarchy;

import session4.B_Multiple_Inheritance.Vehicle;

public abstract class Bus implements Vehicle {
    protected int speed;
    protected int capacity;

    public abstract int capacity();
}
