


class Car {
 
    private final int MAX_SPEED = 200;
    private int currentSpeed;
    public void setSpeed(int speed) {

    if (speed > MAX_SPEED) {
    currentSpeed = MAX_SPEED;
    } else {
    currentSpeed = speed;
    }
    }
    public int getCurrentSpeed() {
    return currentSpeed;
    }
    }
    public class FinalVarA13 {
            public static void main(String[] args) {
    Car car = new Car();
    car.setSpeed(250); // Attempt to exceed MAX_SPEED
    System.out.println("Current Speed: " + car.getCurrentSpeed());
    
   
    
    }
    }