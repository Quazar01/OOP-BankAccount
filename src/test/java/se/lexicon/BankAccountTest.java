package se.lexicon;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    // Test the constructor
    @Test
    public void test_BankAccount() {
        // Create a new BankAccount object
        BankAccount testAccount = new BankAccount("Person 1",
                "test@test.com", "1234567890");
        assert testAccount.getAccountNumber().startsWith("SE");
        assert testAccount.getBalance() == 0;
        assert testAccount.getCustomerName().equals("Person 1");
        assert testAccount.getEmail().equals("test@test.com");
        assert testAccount.getPhoneNumber().equals("1234567890");
    }

    // Test the depositFunds method
    @Test
    public void test_depositFunds() {
        // Create a new BankAccount object
        BankAccount testAccount = new BankAccount("Person 1",
                "test@test.com", "1234567890");
        // Deposit some money into the account.
        testAccount.depositFunds(1000);
        assert testAccount.getBalance() == 1000;
    }

    // Test the withdrawFunds method
    @Test
    public void test_withdrawFunds() {
        // Create a new BankAccount object
        BankAccount testAccount = new BankAccount("Person 1",
                "test@test.com", "1234567890");
        // Deposit some money into the account.
        testAccount.depositFunds(1000);
        // Withdraw some money from the account.
        testAccount.withdrawFunds(500);
        assert testAccount.getBalance() == 500;
    }
}
