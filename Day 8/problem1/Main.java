public class Main {
   public static void main(String[] args) {
      Singleton s1 = Singleton.getInstance();
      Singleton s2 = Singleton.getInstance();

      s1.showMessage();

      // Check if both are same
      System.out.println(s1 == s2);  // Output: true
   }
}
