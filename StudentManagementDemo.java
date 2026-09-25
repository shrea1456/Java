//Student Record Management System

class Student {
    private String studentId;
    private String name;
    private int age;
    private double marks;

    public Student(String studentId, String name, int age, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Marks      : " + marks);
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student("S101", "Rahul Sen", 20, 88.5);
        Student s2 = new Student("S102", "Priya Roy", 21, 94.0);

        System.out.println("--- All Students ---");
        s1.display();
        System.out.println("--------------------");
        s2.display();

        System.out.println("\n--- Highest Scorer Details ---");
        if (s1.getMarks() >= s2.getMarks()) {
            s1.display();
        } else {
            s2.display();
        }
    }
}