import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a num");
        int n =scanner.nextInt();

        int a= factorial(n);
        System.out.println(a);
}

public static int factorial(int n){

    return n*factorial(n-1);
    

}
    
}
