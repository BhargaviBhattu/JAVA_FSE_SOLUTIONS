import java.util.*;

public class SearchService {

    public static List<Product> linearSearch(Product[] products, String keyword) {
        List<Product> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product p : products) {
            if (p.getProductName().toLowerCase().contains(keyword)) {
                result.add(p);
            }
        }

        return result;
    }

    public static int binarySearch(Product[] products, String productName) {
        int low = 0, high = products.length - 1;
        productName = productName.toLowerCase();

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products[mid].getProductName().toLowerCase();

            int compare = midName.compareTo(productName);
            if (compare == 0)
                return mid;
            else if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.getProductName().toLowerCase()));
    }
}

