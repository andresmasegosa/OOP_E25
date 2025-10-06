package session4.B_Multiple_Inheritance;

/**
 * Exercise:
 *  a) Modify the ElectricVehicle interface to introduce a method that allows to update the battery level of a vehicle.

 *  b) Create a class called ElectricPetrolStation that provides a method "void chargeVehicle(ElectricVehicle vehicle)". This method should:
 *      - Accept only instances of vehicles that implement the ElectricVehicle interface.
 *      - Call the batteryLevel() method to check the current battery level before charging.
 *      - Simulate charging the vehicle by increasing the battery level (for simplicity, assume charging adds 10% to the battery, but does not exceed 100%).
 *
 *  c) Add code to the main method below to simulate a scenario where  a TeslaS vehicle go to an ElectricPetrolStation and get charged.

 *  d) Create a class to represent Electric Buses manufactured by Volvo.
 *
 *  e) Add code to the main method below to simulate a scenario where both a TeslaS and a Volvo Electric Bus go to an ElectricPetrolStation and get charged.
 *
 */

public class Exercise2 {

    public static void main(String[] args) {

        ElectricPetrolStation electricPetrolStation = new ElectricPetrolStation();

        TeslaS teslaS = new TeslaS();
        electricPetrolStation.chargeVehicle(teslaS);

        VolvoElectric volvoElectric = new VolvoElectric();
        electricPetrolStation.chargeVehicle(volvoElectric);

        Volvo volvoBus = new Volvo();
        //electricPetrolStation.chargeVehicle(volvoBus); //Compilation error


        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session4_B2", I_did_finish, I_did_understand, comment);
        */

    }
}
