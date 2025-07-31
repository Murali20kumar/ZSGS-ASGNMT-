public class UCO  extends RBI{
    public UCO (Customer customer, Account account){
        super(customer, account);
    }

    public double getInterest(){
        return 6.5;
    }

    public double getWithdrawalLimit(){
        return 35000;
    }
}