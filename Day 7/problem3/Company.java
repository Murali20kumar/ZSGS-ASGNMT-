// Abstract Class
abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

//  subclass
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Another subclass
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class

public class Company {
    public static void main(String[] args) {
        // Employee references
        Employee emp1 = new FullTimeEmployee("Dorian", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Ronnie", 102, 120, 300);

        // Polymorphism
        emp1.displayInfo();  
        emp2.displayInfo();
    }
}