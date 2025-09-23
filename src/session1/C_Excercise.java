package session1;
import feedback.Feedback;

/**
 * This class demonstrates basic arithmetic operations (division) using both integer
 * and floating-point data types, and highlights the differences in their behavior.
 * It also includes a section for providing feedback, though it is currently commented out.
 *
 * The class is designed to:
 * - Initialize integer and floating-point variables.
 * - Perform division on both types of variables.
 * - Display the different results produced by integer and floating-point division.
 * - Optionally, submit feedback on the exercise completion and understanding.
 */

class C_Excercise {

    /**
     * The main method where the execution starts. It demonstrates the difference between
     * integer and floating-point division.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initializing an integer and a double variable with similar values
        int intValue = 10; // Integer variable with value 10
        double doubleValue = 10.0; // Double variable with value 10.0

        // Displaying the initial values of the variables
        System.out.println("Original value of intValue: " + intValue); // Displays 10
        System.out.println("Original value of doubleValue: " + doubleValue); // Displays 10.0
        System.out.println();

        // Performing division on both variables
        intValue /= 4;
        doubleValue /= 4;

        // Displaying the values after division
        System.out.println("intValue after division: " + intValue);
        System.out.println("doubleValue after division: " + doubleValue);

        // Resetting the intValue and demonstrating the difference between
        // integer division (and casting) and direct floating-point division
        intValue = 10; // Resetting intValue to 10

        // Demonstrating integer division behavior by explicitly dividing by a integer  number
        double resultUsingIntDivision = intValue / 4;
        System.out.println("Result using integer division: " + resultUsingIntDivision);

        // Demonstrating floating-point division by directly dividing an integer by a floating-point number
        double resultUsingFloatDivision = intValue / 4.0;
        System.out.println("Result using floating-point division: " + resultUsingFloatDivision);


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        // Feedback section where the user can submit their progress and understanding of the exercise.
        // Uncomment this section to enable feedback submission.

        // Did you have time to finish the exercise?
        boolean I_did_finish = true;

        // Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        // Any comments
        String comment = "No comment";

        // Submitting feedback through the Feedback class
        Feedback.submit("session1_C", I_did_finish, I_did_understand, comment);

    }

}
