public class PersonDemo1 {
public static void main(String[] args) {
//declare an obj
    Person person;

    //initalize an obj
    person=new Person();
    
//initalizing props
    person.name="manoj";
    person.age=10;

    person.displayInfo();
    
}

    
}

class Person{

    String name;
    int age;


    void displayInfo(){

System.out.println(name+age);


    }

    

}
