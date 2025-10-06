package session4.A_Vehicle_Hierarchy;


/**
 * Exercise 2:
 *
 * a) Create a ServiceCenter for SportsCars.
 *
 * The ServiceCenter should be able to:
 *   - Inspect a SportsCar. But it can only inspect SportCars,
 *     nothing else.
 *   - Has a method "boolean inspectCar(SportsCar car)"
 *   - Call its goFast() method.
 *   - Verify that the goFast() call increases the car's speed
 *     by MORE than 10 km/h.
 *
 * If it does, print "goFast works correctly!".
 * Otherwise, print "goFast FAILED".
 *
 * Implement the ServiceCenter class as a separate file (ServiceCenter.java).
 * Then test it with TeslaS and Porsche911 in the main() method of this class.
 *
 * b) Uncomment the code below and try to understand the different statements
 */
public class Exercise2 {

    public static void main(String[] args) {

        ServiceCenter serviceCenter = new ServiceCenter();

        Porsche911 porsche911 = new Porsche911();
        serviceCenter.inspectCar(porsche911);

        TeslaS teslaS = new TeslaS();
        serviceCenter.inspectCar(teslaS);

        Volvo volvo = new Volvo();
        //serviceCenter.inspectCar(volvo); //Compilation Error



        /*
            //Did you have time to finish the exercise?
            boolean I_did_finish = true;

            //Did you understand the concepts used in the exercise?
            boolean I_did_understand = true;

            //Any comments
            String comment = "No comments";

            feedback.Feedback.submit("session4_B", I_did_finish, I_did_understand, comment);
        */

    }

}
