public class Car1 {

   public static void main(String[] args) {

    Car obj=new Car();
    obj.speed=55;
    obj.year=1994;
    obj.color="yellow";
    obj.model="Tesla";

    obj.displaycarinfo();
    obj.Accelerate(20);
    obj.decrease(10);
    
   }
    
}


class Car{

String model;
int year;
String color;
double speed;

void Accelerate(double spe){

speed+=spe;

System.out.println("speed increased"+this.speed);



}

void decrease( double sped){
double newspeed=(this.speed-sped);
System.out.println("speed decreased"+newspeed);
}

void displaycarinfo(){

    System.out.println("Model:"+ this.model + "Year:" + this.year + "Color:" + this.color + "Speed:" +this.speed +"km/h");


}

}