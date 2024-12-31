import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = var1.nextInt();
        int[] arr = new int[n];

        //var1.close();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of elements" + i + 1 + "is: ");
            arr[i] = var1.nextInt();
        }

           Largest lar=new Largest();

            int numr=lar.findLargest(arr);
numr=numr+1;


        System.out.println(numr+1);
    }

    public    int findLargest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];

            }
        }
        return max;

    }

}
