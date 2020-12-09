
import java.util.ArrayList;
import java.util.Scanner;

class ProductInfo {

    public String name;
    public int minPrice = Integer.MAX_VALUE;
    public int maxPrice = Integer.MIN_VALUE;

    ProductInfo(String name, int[] prices) {
        this.name = name;
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
    }

    void printInfo() {
        System.out.println(name + " " + minPrice + " " + maxPrice);
    }
}

class Store {

    private ArrayList<ProductInfo> products = new ArrayList<>();

    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        products.add(pInfo);
    }

    void printAllProductInfo() {
        for (ProductInfo p : products) {
            p.printInfo();
        }
    }
    
    ArrayList<ProductInfo> search(String productName){
        ArrayList<ProductInfo> results = new ArrayList<ProductInfo>();
        for (ProductInfo p : products) {
            if(p.name.indexOf(productName)!= -1)
                results.add(p);
        }
        return results;
    }
}

public class StoreAndSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        String productName = scan.next();
        
        ArrayList<ProductInfo> foundProducts = store.search(productName);
        System.out.println(foundProducts.size());
        if(foundProducts.isEmpty())
            System.out.println("product not found");
        else{
            for (ProductInfo p : foundProducts) {
                p.printInfo();
            }
        }
    }
}
