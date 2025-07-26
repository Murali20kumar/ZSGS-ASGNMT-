import java.util.ArrayList;

public class Store {
    private static String storeName;
    private static String storeLocation;

    private ArrayList<Product> products = new ArrayList<>();

    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayAllProducts() {
        System.out.println("\n--- Product Inventory ---");
        for (Product p : products) {
            p.displayProduct();
            System.out.println("-------------------------");
        }
    }
}