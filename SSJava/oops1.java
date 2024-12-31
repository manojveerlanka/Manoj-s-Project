public class oops1 {


    String email;
     String pswd;

    public static void main(String[] args) {
        
oops1 obj1=new oops1("qweee","pswddfdf");
oops1 obj2=new oops1("qweee2","pswddfdf2");

obj1.signup();
obj2.password();

}
 public   oops1(String email1, String pswd2){

   
    email=email1;
    pswd=pswd2;

   

 }



    public void signup(){


        System.out.println("Login" +email);
    }

    public void password(){

        System.out.println("pswd"+pswd);
    }
}
