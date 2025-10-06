package session4.B_Multiple_Inheritance;


/**
 * Exercise:
 * a) Create the interface ElectricVehicle
 * b) Make TeslaS implements the ElectricVehicle interface.
 * c) Simulate implementation of "int batteryLevel()" printing something a returning an integer between 0 and 100.
 * d) Uncomment the code below and try to understand the different statements
 */
public class Exercise1 {

    public static void main(String[] args) {


        /**
         * Porsche911's objects have the speed method because they are Vehicle's objects too.
         */
        SportsCar porsche911 = new Porsche911();
        System.out.println(porsche911.speed());



        /**
         * Porsche911's objects do not have the "batteryLevel"method because they are not  ElectricVehicle's objects.
         */
        //System.out.println(porsche911.batteryLevel()); //Compilation error



        /**
         * TeslaModelS's objects have the speed method because they are Vehicle's objects too.
         */
        TeslaS teslaModelS = new TeslaS();
        System.out.println(teslaModelS.speed());

        /**
         * TeslaModelS's objects do have the "batteryLevel"method because they also are ElectricVehicle's objects.
         */
        System.out.println(teslaModelS.batteryLevel());

        teslaModelS.goFast();


        /**
         * TeslaModelS's objects are also ElectricVehicle objects.
         */
        //ElectricVehicle electricVehicle = teslaModelS;
        //System.out.println(electricVehicle.batteryLevel());


        /**
         * ElectricVehicle's objects are not Vehicle objects.
         */
        //System.out.println(electricVehicle.speed()); //Compilation Error


        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session4_B1", I_did_finish, I_did_understand, comment);
    */
    }
}
