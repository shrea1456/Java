//Constructor Overloading in Student Information System

class StudentRecord {
    private String studentId;
    private String name;
    private int age;
    private double marks;

    // Constructor 1: Only ID
    public StudentRecord(String studentId) {
        this(studentId, "Unknown", 0, 0.0);
    }

    // Constructor 2: ID and Name
    public StudentRecord(String studentId, String name) {
        this(studentId, name, 0, 0.0);
    }

    // Constructor 3: Complete details
    public StudentRecord(String studentId, String name, int age, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + studentId + " | Name: " + name + " | Age: " + age + " | Marks: " + marks);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("BCA001");
        StudentRecord s2 = new StudentRecord("BCA002", "Ankur");
        StudentRecord s3 = new StudentRecord("BCA003", "Rohit", 20, 89.5);

        s1.display();
        s2.display();
        s3.display();
    }
}