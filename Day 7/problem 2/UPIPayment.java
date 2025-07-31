
public class UPIPayment implements Pay{
    
    private String upi_Id;
    private double amount;

    public UPIPayment(String upiId, double amount) {
        this.upi_Id = upiId;
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Payment of " + amount + " made using UPI ID: " + upi_Id);
    }

 }

