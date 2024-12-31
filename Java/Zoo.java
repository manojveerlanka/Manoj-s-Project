
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    public abstract void move();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Barks");
    }

    @Override
    public void move() {
        System.out.println("Movement: Runs on four legs");
    }
}


class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Chirps");
    }

    @Override
    public void move() {
        System.out.println("Movement: Flies in the sky");
    }
}


class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Blubs");
    }

    @Override
    public void move() {
        System.out.println("Movement: Swims in water");
    }
}


public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 5),
            new Bird("Kiwi", 2),
            new Fish("Goldie", 1)
        };

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }
}
