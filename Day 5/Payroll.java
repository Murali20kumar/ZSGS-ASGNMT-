public class Payroll {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("FT1001", "Dorian", 60000);
        PartTimeEmployee pte = new PartTimeEmployee("PT2001", "Murali", 90, 250);

        System.out.println("--- Full-Time Employee Details ---");
        fte.displayInfo();
        System.out.println("Calculated Salary: ₹" + fte.calculateSalary());

        System.out.println("\n--- Part-Time Employee Details ---");
        pte.displayInfo();
        System.out.println("Calculated Salary: ₹" + pte.calculateSalary());
    }
}