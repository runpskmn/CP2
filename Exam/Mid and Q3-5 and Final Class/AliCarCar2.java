
import java.util.Scanner;

class Car {

    int id;
    String name;
    int price;
    int labor;

    Car(int id, String name, int price, int labor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }

    static boolean check(String name, int price, int labor) {
        if (!name.isEmpty() && price > 0 && labor > 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Factory {

    int n;
    boolean[] canDo;
    int capacity;

    Factory(int n, boolean[] canDo, int capacity) {
        this.n = n;
        this.capacity = capacity;
        this.canDo = new boolean[n + 1];
        for (int i = 1; i <= n; ++i) {
            this.canDo[i] = canDo[i];
        }
    }
}

public class AliCarCar2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N + 1];
        int id = 0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();

            if (Car.check(name, price, labor)) {
                id++;
                cars[id] = new Car(id, name, price, labor);
            }
        }
        Factory[] fac = new Factory[6];
        boolean[] canDo = new boolean[N + 1];
        for (int i = 1; i <= 5; ++i) {
            int cap = scan.nextInt();
            for (int j = 1; j <= N; ++j) {
                int can = scan.nextInt();
                if (can == 0) {
                    canDo[j] = false;
                } else {
                    canDo[j] = true;
                }
            }
            fac[i] = new Factory(id, canDo, cap);
        }
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int order = scan.nextInt();
            if (order > id) {
                System.out.println("invalid model");
                continue;
            }
            int flag = -1;
            for (int j = 1; j <= 5; ++j) {
                if(fac[j].canDo[order] && fac[j].capacity>=cars[order].labor){
                    System.out.println("okay "+j);
                    fac[j].capacity-=cars[order].labor;
                    flag = j;
                    break;
                }
            }
            if(flag < 1)
                System.out.println("unable to build");
        }
    }
}
