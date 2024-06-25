package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a new BankAccount object
        BankAccount testAccount = new BankAccount("Person 1", "test@test.com", "1234567890");
        // Print the account number
        System.out.println("Account number: " + testAccount.getAccountNumber());
        // Print the balance
        System.out.println("Balance: " + testAccount.getBalance());
        // Deposit some money into the account.
        testAccount.depositFunds(1000);
        // Print the balance after deposit.
        System.out.println("Balance after deposition: " + testAccount.getBalance());
        // Withdraw some money from the account.
        testAccount.withdrawFunds(500);
        // Print the balance after withdrawal.
        System.out.println("Balance after withdrawal: " + testAccount.getBalance());
        // Withdraw money more than there is from the account.
        testAccount.withdrawFunds(1500); // This should print the insufficient error message.

    }
}
