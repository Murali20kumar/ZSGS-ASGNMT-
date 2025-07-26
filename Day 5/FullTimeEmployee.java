public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; 
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type         : Full-Time");
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
}