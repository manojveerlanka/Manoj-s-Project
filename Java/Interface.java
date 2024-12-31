

public class Interface {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.2);
        System.out.println("Circle : Area: " + circle.getArea() + "  Perimeter: " + circle.getPerimeter());
        Rectangle rect = new Rectangle();
        rect.setLength(3);
        rect.setWidth(4);
        System.out.println(" Rectangle : Area: " + rect.getArea() + "  Perimeter: " + rect.getPerimeter());

    }
}

interface Shape {
    abstract double getArea();

    abstract double getPerimeter();
}

class Circle implements Shape {
    public double radius;

    public double getArea() {
        double area = 3.14 * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public double getRadius() {
        return this.radius;
    }

    public double setRadius(double rad) {
        this.radius = rad;
        return this.radius;
    }
}

class Rectangle implements Shape {
    public double length;
    public double width;

    public double getLength() {
        return this.length;
    }

    public double setLength(double len) {
        this.length = len;
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double setWidth(double wid) {
        this.width = wid;
        return this.width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }
}