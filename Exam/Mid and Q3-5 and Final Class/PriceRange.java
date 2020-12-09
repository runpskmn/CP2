
import java.util.Scanner;

/*class ProductInfo {
    
   public String name;
   public int minPrice = Integer.MAX_VALUE;
   public int maxPrice = Integer.MIN_VALUE;
   
   ProductInfo(String name,int[] prices){
       this.name = name;
       for(int i=0;i<prices.length;++i){
           if(prices[i]>maxPrice)
               maxPrice = prices[i];
           if(prices[i]<minPrice)
               minPrice = prices[i];
       }
   }
   
   void printInfo(){
       System.out.println(name+" "+minPrice+" "+maxPrice);
   }
}

public class PriceRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        pInfo.printInfo();
    }
}
