import java.util.Scanner;

public class SmallestNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] num = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        
        int smallest = findSmallest(num);
        System.out.println("The smallest element is " + smallest);

        scanner.close(); 
    }


    public static int findSmallest(int[] arr) {
        int min = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];   
            }
        }
        
        return min; 
    }
}
