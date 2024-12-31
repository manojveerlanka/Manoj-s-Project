

public class Instancevar {
    private String accountHolderName; // Instance Variable
    private double balance; // Instance Variable

    public Instancevar(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void printDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating Instances
        Instancevar johnsAccount = new Instancevar("John Doe", 1000.0);
        Instancevar janesAccount = new Instancevar("Jane Doe", 600.0);

        // Initial State
        System.out.println("Initial State:");
        johnsAccount.printDetails();
        janesAccount.printDetails();

        // Deposit to John's Account
        johnsAccount.deposit(500.0);

        // State After Deposit
        System.out.println("\nAfter Deposit to John's Account:");
        johnsAccount.printDetails();
        janesAccount.printDetails();
    }
}
