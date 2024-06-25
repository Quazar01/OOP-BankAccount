package se.lexicon;

public class BankAccount {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static int counter = 0;

    public BankAccount(String accountNumber, long balance, String customerName, String email, String phoneNumber) {
        this(customerName, email, phoneNumber);
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        setAccountNumber();
        setBalance(0);
        if (validateStringInput(customerName, "Customer Name")) {
            this.customerName = customerName;
        }
        if (validateStringInput(email, "Email")) {
            this.email = email;
        }
        if (validateStringInput(phoneNumber, "Phone Number")) {
            this.phoneNumber = phoneNumber;
        }
    }
    // Helper methods
    private void setAccountNumber(){
        this.accountNumber = "SE" + ++counter;
        counter++;
    }
    // Validate costumer name before setting it
    private boolean validateStringInput(String paramValue, String paramName) {
        if(paramValue == null || paramValue.trim().isEmpty()){
            throw new IllegalArgumentException(paramName + " is not valid");
        }else{
            return true;
        }
    }

    // Balance is private, and could be set only by the setBalance method when initializing the object
    // or by the deposit and withdraw methods
    // Validate the balance before setting it
    private void setBalance(long balance) {
        if(balance < 0){
            System.out.println("Invalid balance");
        }else{
            this.balance = balance;
        }
    }

    // Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public long getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerName(String customerName) {
        if (validateStringInput(customerName, "Customer Name")) {
            this.customerName = customerName;
        }
    }
    public void setEmail(String email) {
        if (validateStringInput(email, "Email")) {
            this.email = email;
        }
    }
    public void setPhoneNumber(String phoneNumber) {
        if (validateStringInput(phoneNumber, "Phone Number")) {
            this.phoneNumber = phoneNumber;
        }
    }

    // Deposit and Withdraw methods
    public void depositFunds(long amount) {
        if(amount < 0){
            System.out.println("Invalid amount");
            throw new IllegalArgumentException("Invalid amount");
        }
        this.balance += amount;
    }
    public void withdrawFunds(long amount) {
        if(amount < 0){
            System.out.println("Invalid amount");
            throw new IllegalArgumentException("Invalid amount");
        } else if (amount > this.balance){
            System.out.println("Insufficient funds");
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balance -= amount;
    }


}
