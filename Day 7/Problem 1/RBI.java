public abstract class RBI {
    protected Customer customer;
    protected Account account;
    
    public RBI(Customer customer, Account account){
         this.customer = customer;
         this.account = account;
    }

    public void showCustomerInfo(){
        customer.displayCustomerDetails();
        account.displayAccountDetails();
    }

    public abstract double getInterest();
    public abstract double getWithdrawalLimit();
}