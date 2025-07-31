import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RBI bank = null;

        while (true) {
            System.out.println("\n_____Select Bank__________");
            System.out.println("1. SBI");
            System.out.println("2. UCO");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int bankChoice = scan.nextInt();
            scan.nextLine(); // for newline

            if (bankChoice == 3) {
                System.out.println("👋 Tata!!! Goodbye...");
                break;
            }

            // Customer Details
            System.out.print("Customer Name: ");
            String name = scan.nextLine();
            System.out.print("Enter Address: ");
            String address = scan.nextLine();
            System.out.print("Enter Phone: ");
            String phone = scan.nextLine();

            // Account Details
            System.out.print("Enter Account Number: ");
            String accNo = scan.nextLine();
            System.out.print("Enter Initial Balance: ₹");
            double balance = scan.nextDouble();
            scan.nextLine(); // consume newline

            Customer cust = new Customer(name, address, phone);
            Account acc = new Account(accNo, balance);

            switch (bankChoice) {
                case 1:
                    bank = new SBI(cust, acc);
                    break;
                case 2:
                    bank = new UCO(cust, acc);
                    break;
                default:
                    System.out.println("⚠️ Invalid bank choice!");
                    continue;
            }

            boolean session = true;
            while (session) {
                System.out.println("\n________Bank Menu________");
                System.out.println("1) View Customer Info");
                System.out.println("2) Deposit");
                System.out.println("3) Withdraw");
                System.out.println("4) View Balance");
                System.out.println("5) View Bank Policies");
                System.out.println("6) Back to Bank Selection");
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        bank.showCustomerInfo();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double depo = scan.nextDouble();
                        bank.account.deposit(depo);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdraw = scan.nextDouble();
                        if (withdraw > bank.getWithdrawalLimit()) {
                            System.out.println("⚠️ Withdrawal exceeds limit of ₹" + bank.getWithdrawalLimit());
                        } else {
                            bank.account.withdraw(withdraw);
                        }
                        break;
                    case 4:
                        System.out.println("Current Balance: ₹" + bank.account.getBalance());
                        break;
                    case 5:
                        System.out.println("Interest Rate     : " + bank.getInterest() + "%");
                        System.out.println("Withdrawal Limit  : ₹" + bank.getWithdrawalLimit());
                        break;
                    case 6:
                        session = false;
                        break;
                    default:
                        System.out.println("⚠️ Invalid menu choice!");
                }
            }
        }

        scan.close();
    }
}