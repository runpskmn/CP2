
import java.util.Scanner;

class Product {

    String name, sku;
    double price;
    int weight;
    boolean check;

    Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        check = true;
        if (name == null || name.length() < 1) {
            System.out.println("name is invalid");
            check = false;
        }
        if (sku == null || sku.length() < 1) {
            System.out.println("sku is invalid");
            check = false;
        }
        if (price < 0) {
            System.out.println("price is invalid");
            check = false;
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            check = false;
        }
        return check;
    }

    void printInfo() {
        System.out.print(name + ", " + sku + ", " + price + ", " + weight);
        if (!check) {
            System.out.print(", Invalid");
        }
        System.out.println();
    }
}

class Shoe extends Product{
    int sex,size,type;
    String brand;
    Shoe(String name, String sku, double price, int weight,int sex,int size,int type,String brand){
        super(name,sku,price,weight);
        this.brand = brand;
        this.sex=sex;
        this.type = type;
        this.size = size;
    }
    
    @Override
    void printInfo(){
        super.printInfo();
        if(sex == 1)
            System.out.print("female, ");
        else
            System.out.print("male, ");
        System.out.print(size+", ");
        if(type==1)
            System.out.print("sport, ");
        else if(type==2)
            System.out.print("formal, ");
        else
            System.out.print("casual, ");
        System.out.println(brand);
    }
}
public class ProductStore2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Shoe[] s = new Shoe[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            s[i] = new Shoe(name,sku,prices,weight,gender,size,type,brand);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            boolean valid = s[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            s[i].printInfo();
        }
   
}
}
