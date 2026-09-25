//Payroll System (Inheritance & Method Overriding)

// Base class
class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return baseSalary;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Total Salary: " + calculateSalary());
    }
}

// Subclass for Regular Employees
class RegularEmployee extends Employee {
    private double performanceAllowance;

    public RegularEmployee(String id, String name, double baseSalary, double performanceAllowance) {
        super(id, name, baseSalary);
        this.performanceAllowance = performanceAllowance;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceAllowance;
    }
}

// Subclass for Managers
class Manager extends Employee {
    private double bonus;
    private double travelAllowance;

    public Manager(String id, String name, double baseSalary, double bonus, double travelAllowance) {
        super(id, name, baseSalary);
        this.bonus = bonus;
        this.travelAllowance = travelAllowance;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus + travelAllowance;
    }
}

public class PayrollDemo {
    public static void main(String[] args) {
        Employee emp = new RegularEmployee("E101", "Bob Smith", 35000, 5000);
        Employee mgr = new Manager("M201", "Alice Johnson", 60000, 15000, 8000);

        emp.display();
        mgr.display();
    }
}