 class Employee {
    private int empId;
    private String empName;
    private String designation;
    private String department;
    private double salary;

    public Employee(int empId, String empName, String designation, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public void setName(String empName) {
        this.empName = empName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getannualSalary(){
        return salary * 12;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Annual Salary: " + getannualSalary());
        System.out.println("-----------------------------");
    }

}

public class EmployeeMain{
    public static void main(String[]args){
        Employee emp1 = new Employee(101, "Dorian Yates", "Software Engineer", "IT", 60000);
        Employee emp2 = new Employee(102, "Ronnie Coleman", "Project Manager", "IT", 80000);
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        emp1.setSalary(65000);
        System.out.println("Updated Details: ");
        emp1.displayEmployeeDetails();
    }
}