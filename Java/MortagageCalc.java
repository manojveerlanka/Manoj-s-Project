import java.util.Scanner;

public class MortagageCalc {
    
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
         
            System.out.print("Enter the principal loan amount (e.g., 200000): ");
            double principal = scanner.nextDouble();
    
            System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
            double annualInterestRate = scanner.nextDouble();
    
            System.out.print("Enter the loan period in years (e.g., 30): ");
            int years = scanner.nextInt();
    
       
            double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, years);
    
         
            System.out.printf("Your monthly mortgage payment is: $%.2f%n", monthlyPayment);
    
            scanner.close();
        }
    
        public static double calculateMonthlyPayment(double principal, double annualInterestRate, int years) {
            double monthlyInterestRate = annualInterestRate / 100 / 12;
            int numberOfPayments = years * 12;
            double rateFactor = Math.pow(1 + monthlyInterestRate, numberOfPayments);
            double monthlyPayment = principal * (monthlyInterestRate * rateFactor) / (rateFactor - 1);
    
            return monthlyPayment;
        }
    }
    


