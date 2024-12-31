import java.util.Scanner;

public class MulFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

      
        printMultiplicationTable(number);

        scanner.close(); 
    }

    public static void printMultiplicationTable(int n) {
       
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
