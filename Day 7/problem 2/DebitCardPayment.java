
public class DebitCardPayment implements Pay {
    private String cardNumber;
    private double amount;

    public DebitCardPayment(String var1, double var2) {
        this.cardNumber = var1;
        this.amount = var2;
    }

    public void pay() {
        System.out.println("Payment of " + amount + " made using Debit Card: " + cardNumber);
    }
    
}
