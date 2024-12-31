public class CalcOverTestA8 {
    public static void main(String[] args) {

        CalcOverA8 calculator = new CalcOverA8();

        int sumInt = calculator.add(10, 20);
        System.out.println("Sum of two integers (10 + 20): " + sumInt);

        double sumDouble = calculator.add(10.5, 20.5);
        System.out.println("Sum of two doubles (10.5 + 20.5): " + sumDouble);

        int sumThreeIntegers = calculator.add(5, 10, 15);
        System.out.println("Sum of three integers (5 + 10 + 15): " + sumThreeIntegers);
    }
}
