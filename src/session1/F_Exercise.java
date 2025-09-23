package session1;
import feedback.Feedback;

/**
 * This class demonstrates the scoping of variables in a loop and attempts to explain
 * why an error occurs when accessing a variable outside its declared scope. It also
 * includes a section for providing feedback, which is currently commented out.
 *
 * The main error to explore:
 * - If Line 34 (`System.out.println("Sum is: "+sum);`) is uncommented, the code will result
 *   in a compilation error.
 *
 * - Why?
 *
 * The exercise aims to explain and fix the scoping issue.
 */

public class F_Exercise {

    /**
     * The main method where the execution starts. This method demonstrates the use of a for-loop
     * to sum the values of an integer. It also explains the issue of variable scoping.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int sum = 0;
        // Declaring a for loop that iterates 10 times
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }

        // Uncommenting the line below would cause a compilation error. Why?!?!
        System.out.println("Sum is: " + sum);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        // Feedback section where the user can submit their progress and understanding of the exercise.
        // Uncomment this section to enable feedback submission.

        // Did you have time to finish the exercise?
        boolean I_did_finish = true;

        // Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        // Any comments
        String comment = "No comments";

        // Submitting feedback through the Feedback class
        Feedback.submit("session1_F", I_did_finish, I_did_understand, comment);
        */

    }

}
