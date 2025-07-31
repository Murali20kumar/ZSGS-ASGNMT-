import java.util.Scanner;
public class MainPay {
    
    public static void main (String [] args){
       Scanner scan = new Scanner(System.in);
       Pay p = null;

       System.out.println("______Payment Options______");
       System.out.println("1) Credit Card");
       System.out.println("2) Debit Card");
       System.out.println("3) UPI ID");
       System.out.println("Choose your payment option : ");
       int choice = scan.nextInt();

       System.out.println("Enter the amount to be paid: ");
       double amount = scan.nextDouble();
       System.out.println("Enter the Debit/Credit Card number or UPI ID: ");
       String cardOrUpi = scan.next();

       switch(choice) {
           case 1:
               p = new CreditCardPayment(cardOrUpi, amount);
               break;
           case 2:
               p = new DebitCardPayment(cardOrUpi, amount);
               break;
           case 3:
               p = new UPIPayment(cardOrUpi, amount);
               break;
           default:
               System.out.println("Invalid choice");
               scan.close();
               return;
       }
       
       p.pay(); // Call the pay method of the selected payment option 
       scan.close();
       System.out.println("Payment successful!");
    }
}
