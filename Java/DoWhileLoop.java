import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        //Loop executes atleast once
        // condition checked at the end

        int n;
        System.out.println("Square Calculation");

        Scanner scn=new Scanner(System.in);

        do{

            System.out.println("Enter a number not less than 1");
            n=scn.nextInt();
            System.out.println("sueare of" +n+"="+n*n);




        }while(n!=0);
        scn.close();

        
    }
    
}
