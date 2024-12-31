import java.util.Scanner;
public class AddNumbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st value");
        int n=scan.nextInt();
        
        System.out.println("enter 2nd value");
        int n1=scan.nextInt();
       
       
        int num2=5;

        for (int i=0;i<num2;i++)
        {
        if (n1>num2){
            int sum=n+n1;
            System.out.println("sum =" + sum);

        }else{
            int sum=n-n1;
            System.out.println("sum =" + sum);
        }
    }



        // int a=18;
        // int b=10;

        // int c=a+b;

       

        
    }
    
}
