package session1;
import feedback.Feedback;

import java.util.Scanner;

/**
 * This class demonstrates a simple program that computes a mathematical function.
 * a) Which is the function being computed by this code? (Hint: Use the debugger)
 * b) Re-write it using a while-loop?
 */
public class H_Exercise {
    public static void main(String[] args) {

        // Create a Scanner object to allow input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input an integer value
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Read the input integer from the user

        // Initialize a variable to store the result
        int result = 1;

        // Use a for-loop to perform repeated operations based on the input
        for (int i = 0; i < number; i++) {
            result *= 2;  // Update the result during each iteration
        }

        // Print the final result to the console
        System.out.println(result);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        // Provide feedback on whether the exercise was completed
        boolean I_did_finish = true;

        // Provide feedback on whether the concepts were understood
        boolean I_did_understand = true;

        // Option to add additional comments
        String comment = "No comments";

        // Submit the feedback using the Feedback class
        Feedback.submit("session1_H", I_did_finish, I_did_understand, comment);
        */
    }
}
