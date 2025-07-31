public class FullTimeEmployee implements Employee {
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calcSalary() {
        return monthlySalary; //  monthly salary
    }

    public String getName() {
        return name;
    }
}