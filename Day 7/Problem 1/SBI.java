public class SBI extends RBI {
    public SBI(Customer customer, Account account){
        super(customer, account);
    }

    public double getInterest(){
        return 5.6;
    }

    public double getWithdrawalLimit(){
        return 25000;
    }
}