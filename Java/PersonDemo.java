public class PersonDemo {

    public static void main(String[] args) {

        Person person=new Person();
        person.name="jhon";
        person.age=10;
        person.displayInfo();
        
    }
    
}
// class contains Properties and functions(Methods)
class Person{

    String name;
int age;

void displayInfo(){

System.out.println("Name:"+ this.name);

}


}
