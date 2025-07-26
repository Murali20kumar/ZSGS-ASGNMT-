class PaymentGateway{

    private String transactionId;
    private String payername;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    public PaymentGateway(String transactionId, String payername, String payeeName, double amount, String paymentMethod, String transactionStatus) {
        this.transactionId = transactionId;
        this.payername = payername;
        this.payeeName = payeeName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = transactionStatus;
    }

    public String gettransactionId() {
        return transactionId;
    }

    public String getPayername() {
        return payername;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public double getAmount() {
        return amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public String getTransactionStatus() {
        return transactionStatus;
    }
    public void settransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void displayTransactionSummary(){

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payer Name: " + payername);
        System.out.println("Payee Name: " + payeeName);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Transaction Status: " + transactionStatus);
    }
}

public class Payment {
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentGateway("MDF5669", "Joe Weider", "Dorian", 1500000.75, "Cheque", "Completed");
        payment.displayTransactionSummary();
    }
}