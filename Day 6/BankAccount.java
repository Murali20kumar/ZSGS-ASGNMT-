 import java.util.Scanner;
 class BankAcc{

    private String accNo;
    private String accholderName;
    private double balance;

    public BankAcc(String accNo, String accholderName, double balance){
        this.accNo = accNo;
        this.accholderName = accholderName;
        this.balance = Math.max(0, balance);
    }

    public String getaccNo(){
        return accNo;
    }
    public String getaccholderName(){
        return accholderName;
    }
    public double getbalance(){
        return balance;
    }

    public void setaccNo(String accholderName){
         this.accholderName = accholderName;
    }
    public void setbalance(double amount){
        if(amount >= 0){
            this.balance = amount;
        }
        else{
            System.out.println("Invalid amount!! ");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    
    public void withdraw (double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
             System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else{
            System.out.println("Withdrawal failed: Insufficient balance!!!.");
        }

    }

    public void displayInfo(){
        System.out.println(" ----- Account Info -----");
        System.out.println("Account number: " + accNo);
        System.out.println("Account Holder Name:" + accholderName);
        System.out.println("Balance:" + balance);
        System.out.println("__________________________________________");
    }

}

public class BankAccount{

    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);

        BankAcc account = new BankAcc("ACC2025", "Murali", 1000000);

        boolean running = true;

        while (running) {
            System.out.println("\n========= Bank Menu =========");
            System.out.println("1. View Account Info");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.displayInfo();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4 : 

                     System.out.println("Your Balance:" + account.getbalance());
                     break;
                case 5:
                    running = false;
                    System.out.println("👋 Thank you for banking with us!");
                    break;
                

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();

    }
}