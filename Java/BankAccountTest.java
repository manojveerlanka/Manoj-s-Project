public class BankAccountTest {
    public static void main(String[] args) {
    
    BankAccount myAccount = new BankAccount("123456789",
    1000.00);
   
    System.out.println("Account Number: " + myAccount.getAccountNumber());
    System.out.println("Initial Balance: " + myAccount.getBalance());

    myAccount.deposit(500.00); 
    myAccount.withdraw(200.00); 
    myAccount.withdraw(1500.00); 
    System.out.println("Final Balance: " + myAccount.getBalance());
    }
    }