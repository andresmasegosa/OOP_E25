package session8.a_bankaccount;

import java.util.Scanner;

/*
    **Java Exercise: Exception Handling in BankAccount Class**

    **Task:** Modify the `deposit` method in the `BankAccount` class to prevent negative deposits.

    **Steps:**
    1. In the `deposit` method, check if the deposit amount is negative.
    2. If negative, throw an `IllegalArgumentException` with the message "Cannot deposit negative amount".
    3. Ensure valid amounts are deposited as usual.
    4. Manually test the updated method:
       - Confirm positive amounts deposit successfully.
       - Verify a negative amount triggers the `IllegalArgumentException`.
    5. In the main method, catch and print the exception message when a negative deposit is attempted.
*/
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to deposit:");
        int amount = scanner.nextInt();
        try {
            account.deposit(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Something went wrong"+e.getMessage());
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session8_A", I_did_finish, I_did_understand, comment);
        */
    }
}
