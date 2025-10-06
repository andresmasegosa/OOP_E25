package session4.A_Vehicle_Hierarchy;

public class Volvo extends Bus {
    @Override
    public int capacity() {
        return 50;
    }

    @Override
    public int speed() {
        return 120;
    }
}
