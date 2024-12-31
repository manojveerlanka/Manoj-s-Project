public class StdntClassA6p2 {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {

        StdntClassA6p2 student = new StdntClassA6p2();
        student.marks = 95;
        student.name = "Alice";
        student.rollNumber = 20;

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Grade: " + student.calculateGrade());
    }
}