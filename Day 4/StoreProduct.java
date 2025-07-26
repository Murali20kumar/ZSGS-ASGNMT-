public class StoreProduct {
    Store.setStoreDetails("Saravana Store", "Melapalayam");
    Store.displayStoreDetails();

    Store store = new Store();

    Product p1 = new Product(101, "Whey", 4000.0, 100);
    Product p2 = new Product(102, "Creatine", 500.0, 200);
    Product p3 = new Product(103, "Mass gainer", 1200.0, 150);

    store.addProduct(p1);
    store.addProduct(p2);   
    store.addProduct(p3);

    store.displayAllProducts();
}
