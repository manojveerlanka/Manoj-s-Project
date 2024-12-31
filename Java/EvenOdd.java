import java.util.Scanner;
public class EvenOdd {
    

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enetr a number");
        int n=scanner.nextInt();
        // Another approch using Ternary operator without using if else 

String result= (n%2==0) ? "Even" : "odd";
System.out.println(result);

//Using if esle way

        if(n%2==0){
            System.out.println("Enetred number is Even");

        }else{
            System.out.println("Enetred number is Odd");
        }

    }
}
