package session8.b_customexceptions;

import org.junit.jupiter.api.Test;
import session8.c_checked_exceptions.NegativeAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 **Exercise: Write Tests for the BankAccount deposit Method**

 **Task:** Write JUnit tests to validate the `deposit` method in `BankAccount` according to deposit rules.

 **Requirements:**
 1. Test that a valid deposit updates the account balance correctly.
 2. Test that depositing a negative amount throws `NegativeDepositException`.
 3. Test that deposits over 100,000 DKK throw `WarningLargeDeposit`, verifying the exception contains the triggering amount.

 **Instructions:**
 - Use `assertEquals` to confirm correct balance updates.
 - Use `assertThrows` to check for exceptions on invalid deposits.
 - Ensure the balance remains unchanged if an exception occurs.
 */


class Exercise {


    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(100);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void negativeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
        NegativeDepositException e = assertThrows(NegativeDepositException.class,
                () -> bankAccount.deposit(-10));

        assertEquals("This is not allowed. It is a negative quantity.",e.getMessage());
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void largeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
        WarningLargeDeposit e =
                assertThrows(WarningLargeDeposit.class,
                        () -> bankAccount.deposit(10_000_000));


        assertEquals(10_000_000, e.getAmount());
        assertEquals("Amount is too large.",e.getMessage());

        assertEquals(100, bankAccount.getBalance());
    }


}