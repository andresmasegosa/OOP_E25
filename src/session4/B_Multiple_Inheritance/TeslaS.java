package session4.B_Multiple_Inheritance;

public class TeslaS extends SportsCar implements ElectricVehicle {

    int batteryLevel;
    public TeslaS() {
        super(350);
        this.batteryLevel=80;
    }

    @Override
    public boolean goFast() {
        if ( (this.speed+50) < this.maxSpeed)
            super.speed+=50;
        else
            super.speed=super.maxSpeed;

        return true;
    }


    @Override
    public int batteryLevel() {
        return batteryLevel;
    }

    @Override
    public void increaseBatteryLevel(int value){
        if (batteryLevel+value>100)
            batteryLevel=100;
        else
            this.batteryLevel+=value;
    }
}
