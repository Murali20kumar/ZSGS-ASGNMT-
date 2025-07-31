public class PartTimeEmployee implements Employee{

    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name , double hoursWorked, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calcSalary(){
        return hourlyRate * hoursWorked;  
    }

    public String getName() {
        return name;
    }
}