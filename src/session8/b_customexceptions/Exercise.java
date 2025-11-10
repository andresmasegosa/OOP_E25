package session8.b_customexceptions;

import java.util.Scanner;

/*
    **Exercise: Implementing Custom Exceptions in BankAccount Class**

    **Task:** Enhance the `deposit` method in the `BankAccount` class by adding two custom exceptions: `NegativeDepositException` and `WarningLargeDeposit`.

    **Steps:**
    1. Define `NegativeDepositException`, a custom exception.
    2. Define `WarningLargeDeposit`, another custom exception with:
       - Fields for the deposit amount and limit (100,000 DKK).
       - A constructor to initialize these fields.
       - Getter methods for the fields.
    3. In the `deposit` method:
       - Throw `NegativeDepositException` with a message if the amount is negative.
       - Throw `WarningLargeDeposit` if the deposit exceeds 100,000 DKK.
    4. In the main method, handle each exception separately:
       - For `NegativeDepositException`, print: "You were trying to deposit a negative amount."
       - For `WarningLargeDeposit`, print: "You must justify the origin of [amount]. The limit is [deposit limit] DKK."
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
        } catch (NegativeDepositException e) {
            System.out.println("You were trying to deposit a negative amount.");
        } catch (WarningLargeDeposit e) {
            System.out.println("You must justify the origin of"+e.getAmount()+
                    "The limit is "+e.getLimit()+" dkk.");
        }
        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_B", I_did_finish, I_did_understand, comment);
        */
    }
}
