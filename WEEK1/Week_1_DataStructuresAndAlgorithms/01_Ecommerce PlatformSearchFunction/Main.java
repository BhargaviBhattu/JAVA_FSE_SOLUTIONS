import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = ProductDatabase.getAllProducts();

        System.out.println(" E-commerce Product Search Engine");
        System.out.println("1. Linear Search (partial match)");
        System.out.println("2. Binary Search (exact match)");
        System.out.print("Choose option (1 or 2): ");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            System.out.print("Enter keyword to search: ");
            String keyword = sc.nextLine();

            List<Product> results = SearchService.linearSearch(products, keyword);

            if (results.isEmpty()) {
                System.out.println(" No products found.");
            } else {
                System.out.println(" Products found:");
                for (Product p : results) {
                    System.out.println(p);
                }
            }

        } else if (option == 2) {
            SearchService.sortProductsByName(products);

            System.out.print("Enter exact product name: ");
            String productName = sc.nextLine();

            int index = SearchService.binarySearch(products, productName);
            if (index != -1) {
                System.out.println(" Product found:");
                System.out.println(products[index]);
            } else {
                System.out.println(" Product not found.");
            }

        }

        sc.close();
    }
}
