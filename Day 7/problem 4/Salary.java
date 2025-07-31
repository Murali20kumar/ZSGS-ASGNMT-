import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;

        System.out.println("Enter Employee Type : ");
        System.out.println("1) Full-Time Employee");
        System.out.println("2) Part-Time Employee");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        if (type == 1) {
            System.out.print("Enter Monthly Salary: ₹");
            double monthlySalary = sc.nextDouble();
            emp = new FullTimeEmployee(name, monthlySalary);
        } else if (type == 2) {
            System.out.print("Enter Hours Worked: ");
            double hours = sc.nextDouble();
            System.out.print("Enter Hourly Rate: ₹");
            double rate = sc.nextDouble();
            emp = new PartTimeEmployee(name, hours, rate);
        } else {
            System.out.println("⚠️ Invalid type selected. Please choose 1 or 2.");
            sc.close();
            return;
        }

        double salary = emp.calcSalary();
        System.out.println("Salary of " + name + " is ₹" + salary);

        sc.close();
    }
}