public class BankAccount {
    
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    if (initialBalance >= 0) {
    this.balance = initialBalance;
    } else {
    System.out.println("Initial balance can't be negative, setting balance to 0.");
    this.balance = 0;
    }
    }
    
    public void deposit(double amount) {
    if (amount > 0) {
    balance += amount;
    System.out.println("Deposited " + amount + ". New balance: " + balance);
    } else {
    System.out.println("Amount to deposit must be positive.");
    }
    }
    
    public void withdraw(double amount) {
    if (amount > 0) {
    if (amount <= balance) {
    balance -= amount;
    System.out.println("Withdrew " + amount + ".    New balance: " + balance);
    } else {
    System.out.println("Insufficient funds. Withd    rawal denied.");
    }
    } else {
    System.out.println("Amount to withdraw must be positive.");
    }
    }

    public double getBalance() {
    return balance;
    }
    
    public String getAccountNumber() {
    return accountNumber;
    }
    }