public class Account{
    private String acc_No;
    private double balance;

    public Account(String acc_No, double balance){
          this.acc_No = acc_No;
          this.balance =  balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited :" + amount);
        System.out.println("Current Balance :" + balance);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn :" + amount);
            System.out.println("Current Balance:" + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }
    
    public void displayAccountDetails(){
        System.out.println("Account Number :" + acc_No);
        System.out.println("Balance :" + balance);
    }

}