package session4.B_Multiple_Inheritance;

public class VolvoElectric extends Bus implements ElectricVehicle {
    int batteryLevel = 10;

    @Override
    public int capacity() {
        return 50;
    }

    @Override
    public int speed() {
        return 120;
    }

    @Override
    public int batteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void increaseBatteryLevel(int value) {
        if (batteryLevel+value>100)
            batteryLevel=100;
        else
            this.batteryLevel+=value;
    }
}
