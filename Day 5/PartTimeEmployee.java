public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String employeeId, String name, int hoursWorked, double ratePerHour) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type         : Part-Time");
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.println("Rate per Hour: ₹" + ratePerHour);
    }
}

