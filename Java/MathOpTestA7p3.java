

import java.util.Scanner;
public class MathOpTestA7p3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take two integer inputs from the user
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int num2 = scanner.nextInt();
// Perform the operations using MathOperations class
System.out.println("Addition: " + MathOpA7.add
(num1, num2));
System.out.println("Subtraction: " + MathOpA7.subtract(num1, num2));
System.out.println("Multiplication: " + MathOpA7.multiply(num1, num2));
// Division with error handling for division by zero
double result = MathOpA7.divide(num1, num2);
if (!Double.isNaN(result)) {
System.out.println("Division: " + result);
}
scanner.close();

}
}