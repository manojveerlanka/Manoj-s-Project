import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =scan.nextInt();

        if (n==1){

            System.out.println("Monday");

        }else if(n==2){
            System.out.println("Tues");

        }else if(n==3){
            System.out.println("Wed");

        }

        scan.close();
    }
    
}
