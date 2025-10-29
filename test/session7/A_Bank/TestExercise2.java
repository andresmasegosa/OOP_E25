package session7.A_Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Exercise: Test the method "public void deposit(int amount)" of the Bank class.
 * a) Don't look at the implementation.
 *
 */
public class TestExercise2 {

    @Test
    public void test(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(25);
        int balance= bankAccount.getBalance();
        assertEquals(125,balance);
    }


    /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
    /*
    @Test
    public void feedback() {
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session7_B", I_did_finish, I_did_understand, comment);
        }
     */
}
