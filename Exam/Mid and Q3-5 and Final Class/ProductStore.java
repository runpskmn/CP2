
import java.util.ArrayList;
import java.util.Scanner;

//class Product {
    String name,sku;
    double price;
    int weight;
    boolean check;
    Product(String name,String sku,double price,int weight){
        this.name=name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }
    
    boolean checkValidity(){
        check = true;
        if(name == null || name.length()< 1){
            System.out.println("name is invalid");
            check = false;
        }if(sku == null || sku.length() < 1){
            System.out.println("sku is invalid");
            check = false;
        }if(price<0){
            System.out.println("price is invalid");
            check = false;
        }if(weight<0){
            System.out.println("weight is invalid");
            check = false;
        }
        return check;
    }
    
    void printInfo(){
        System.out.print(name+", "+sku+", "+price+", "+weight);
        if(!check)
            System.out.print(", Invalid");
        System.out.println();
    }
}

public class ProductStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Product[] p = new Product[N]; 
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            p[i] = new Product(name,sku,prices,weight);
        }

        for (int i = 0; i < N; ++i) {
            boolean valid = p[i].checkValidity();
            System.out.println(valid);
        }
        
        for(int i=0;i<N;++i){
            p[i].printInfo();
        }
    }
}
