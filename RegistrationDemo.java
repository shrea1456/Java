//Static Auto-Generated Student Registration System

class RegisteredStudent {
    private static int totalStudents = 0; 
    private int studentId;                
    private String name;

    public RegisteredStudent(String name) {
        totalStudents++;
        this.studentId = 1000 + totalStudents; 
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId + " | Name: " + name);
    }

    public static void displayTotalRegistered() {
        System.out.println("Total registered students: " + totalStudents);
    }
}

public class RegistrationDemo {
    public static void main(String[] args) {
        RegisteredStudent st1 = new RegisteredStudent("Amit");
        RegisteredStudent st2 = new RegisteredStudent("Neha");
        RegisteredStudent st3 = new RegisteredStudent("Karan");

        st1.displayStudent();
        st2.displayStudent();
        st3.displayStudent();

        RegisteredStudent.displayTotalRegistered();
    }
}