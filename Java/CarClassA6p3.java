public class CarClassA6p3 {
    

   
    private String model;
    private int year;
    private String color;
    private double speed;
   
    public CarClassA6p3(String model, int year, String color, double speed){
    this.model = model;
    this.year = year;
    this.color = color;
    this.speed = speed;
    }
    
   
   
    public void accelerate(double speedIncrease) {
    speed = speed + speedIncrease;
    }
   
    public void brake(double speedDecrease) {
    if (speed - speedDecrease >= 0) {
    speed -= speedDecrease;
    } else {
    speed = 0; 
    }
    }
    
    public void displayCarDetails() {
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + color);
    System.out.println("Current Speed: " + speed + " km/h");
    }
   
    public static void main(String[] args) {

    CarClassA6p3 car = new CarClassA6p3("Toyota Corolla", 2022, "Red", 50);
   
    car.displayCarDetails();
  
    car.accelerate(20);
    System.out.println("\nAfter acceleration:");
    car.displayCarDetails();  
  
    
   
    car.brake(10);
    System.out.println("\nAfter brake:");
    car.displayCarDetails();
    }
}
