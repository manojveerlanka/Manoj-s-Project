public class Staticeg {

    public static int count=0;
     
public  Staticeg() 
{
count++;

}
public static void  getcount(){

    //return count;
    //System.out.println(count);
    count++;
}

public static void main(String[] args) {

   // Staticeg temp=new Staticeg();
   //new Staticeg();

    System.out.println( count);
    System.out.println( getcount());
    System.out.println( new Staticeg().getcount());

    
}
     
    
}
