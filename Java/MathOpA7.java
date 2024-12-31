

public class MathOpA7 {
    // Method to add two numbers
    public static int add(int a, int b) {
    return a + b;
    }
    // Method to subtract two numbers
    public static int subtract(int a, int b) {
    return a - b;
    }
    // Method to multiply two numbers
    public static int multiply(int a, int b) {
    return a * b;
    }
   
    public static double divide(int a, int b) {
    if (b == 0) {
    System.out.println("Error: Division by zero is not allowed.");
    return Double.NaN; 
    }
    return (double) a / b;
}
}
