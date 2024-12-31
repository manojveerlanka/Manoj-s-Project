import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter Marks");
        int n =s.nextInt();
        //float per=(n/40)*100;

        String result=(n>40)?"passed":"Failed";

        System.out.println(result);
        s.close();
        
    }
    
}
