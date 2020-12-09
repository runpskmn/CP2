
import java.util.Scanner;

//class Truck {
    
    int weight,amount;
    
    Truck(int weight,int amount){
        this.amount = amount;
        this.weight=weight;
    }
    
    double calFuel(int distance){
        double fuel = (distance+weight)/10.0;
        return Math.ceil(fuel);
    }
}

public class TestTruck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(in.nextInt(), in.nextInt());
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int distance = in.nextInt();
            System.out.println(t[x-1].calFuel(distance));
        }
    }
}
