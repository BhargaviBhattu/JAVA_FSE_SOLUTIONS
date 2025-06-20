public class ProductDatabase {
    public static Product[] getAllProducts() {
        return new Product[]{
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Footwear"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };
    }
}
