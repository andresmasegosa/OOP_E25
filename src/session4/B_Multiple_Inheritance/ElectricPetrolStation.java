package session4.B_Multiple_Inheritance;

public class ElectricPetrolStation {
    public void chargeVehicle(ElectricVehicle vehicle){
        int batteryLevel = vehicle.batteryLevel();
        vehicle.increaseBatteryLevel(10);
    }
}
