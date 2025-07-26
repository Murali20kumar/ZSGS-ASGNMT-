public class Product {
   private int productId;
   private String Name;
   private double price;
   private int quantity;  

   public Product(int productId, String Name, double price, int quantity) {
       this.productId = productId;
       this.Name = Name;
       this.price = price;
       this.quantity = quantity;
   }

   public void displayProduct(){
    System.out.println("Product ID   : " + productId);
    System.out.println("Product Name : " + Name);
    System.out.println("Price        : $" + price); 
    System.out.println("Quantity     : " + quantity);
   }
}

