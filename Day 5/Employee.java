public class Employee {
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
    }
}