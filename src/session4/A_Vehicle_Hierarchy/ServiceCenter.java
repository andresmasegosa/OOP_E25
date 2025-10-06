package session4.A_Vehicle_Hierarchy;

public class ServiceCenter {

    public boolean inspectCar(Sportscar car){

        int currentSpeed = car.speed();
        car.goFast();
        int newSpeed = car.speed();

        if (newSpeed>=currentSpeed + 10)
            return true;
        else
            return false;
    }
}
