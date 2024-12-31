

import java.util.ArrayList;

public class Assignment11 {
    public static void main(String[] args) {
      

        ArrayList<Animal> animalarr = new ArrayList<Animal>();
        Dog dog = new Dog("pandu", 10);
        Bird bird = new Bird("parrot", 5);
        Fish fish = new Fish("nemo", 1);
        animalarr.add(dog);
        animalarr.add(fish);
        animalarr.add(bird);
        for(Animal animal :animalarr ){
          animal.makeSound();
          animal.move();
          animal.displayInfo();
        }        
    }
}

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    abstract void makeSound();

    abstract void move();

    public void displayInfo() {
        System.out.println("Name: " + name + "  Age: " + age);
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Sound: Noise");
    }

    public void move() {
        System.out.println("Move: Runs.");
    }
}

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Sound: Loud");
    }

    public void move() {
        System.out.println("Move: Hign in the sky");
    }
}

class Fish extends Animal {

    Fish(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Sound: Noise");
    }

    public void move() {
        System.out.println("Move: Swim");
    }
}
