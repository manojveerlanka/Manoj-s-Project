public class BankAccount1 {

    public static void main(String[] args) {

        BankDetails obj=new BankDetails("L20570700", 500);
        System.out.println(obj.getbalance());

        
        obj.deposit(50);

        System.out.println("main1"+obj.getAccountnumber());
        System.out.println("main1"+obj.getbalance());

        obj.withdraw(30);

       

        

        
    }

    
}


class BankDetails{

private String accountnumber;
private  double balance;


BankDetails( String acnumber, double bal){

    this.accountnumber=acnumber;
    this.balance=bal;
}



public double deposit(double n){
 
    return balance+=n;

}

public double withdraw(double w){

    return balance-=w;
}



public double getbalance(){
    //System.out.println(balance);
    return balance;

}

public String getAccountnumber(){

    //System.out.println(accountnumber);
    return accountnumber;
   
}




}

