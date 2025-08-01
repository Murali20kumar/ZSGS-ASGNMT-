public class Singleton {
   //Create a private static instance of this class
   private static Singleton singleInstance = new Singleton();

   // Make the constructor private
   private Singleton() {
      System.out.println("Singleton Instance Created");
   }

   //Provide a public static method to get the instance
   public static Singleton getInstance() {
      return singleInstance;
   }

   public void showMessage() {
      System.out.println("Hello from Singleton!");
   }
}
