
import java.util.Scanner;

/*class Car {
    int id;
    String name;
    int price;
    int labor;
    
    Car(int id,String name,int price,int labor){
        this.id = id;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }
    
    static boolean check(String name,int price,int labor){
        if(!name.isEmpty() && price >0 && labor>0){
            return true;
        }else{
            return false;
        }
    }
}
public class AliCarCar1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N+1];
        int id =0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (Car.check(name, price, labor)) {
                 id++;
                 cars[id] =new Car(id,name,price,labor);
                 System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

        for (int i=1;i<=id;++i) {
            System.out.println(i + " " + cars[i].name);
        }
    }
}
