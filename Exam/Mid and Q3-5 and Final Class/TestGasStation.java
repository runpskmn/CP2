
import java.util.Scanner;

class Truck {

    int weight, amount;

    Truck(int weight, int amount) {
        this.amount = amount;
        this.weight = weight;
    }

    double calFuel(double distance) {
        double fuel = (distance + weight) / 10.0;
        return Math.ceil(fuel);
    }
}

class GasStation {

    int k;
    double[] amount;

    GasStation(double[] amount) {
        k = amount.length;
        this.amount = amount.clone();
    }

    void fillTank(int type, Truck truck, double distance) {
        double need = truck.calFuel(distance);
        if (need > amount[type - 1]) {
            amount[type - 1] = 0;
            System.out.println(type + " out of gasoline");
        } else {
            amount[type - 1] -= need;
        }
    }

    void refuel(double[] a) {
        for (int i = 0; i < k; ++i) {
            amount[i] += a[i];
        }
    }

    void print() {
        for (int i = 0; i < k; ++i) {
            System.out.print(amount[i] + " ");
        }
        System.out.println();
    }
}

public class TestGasStation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(in.nextInt(), in.nextInt());
        }

        int k = in.nextInt();
        double[] amount = new double[k];
        for (int i = 0; i < k; ++i) {
            amount[i] = in.nextInt();
        }
        GasStation station = new GasStation(amount);

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int order = in.nextInt();
            if (order == 0) { // fillTank
                int A = in.nextInt();
                int T = in.nextInt();
                double D = in.nextDouble();
                station.fillTank(T, t[A - 1], D);
            } else if (order == 1) { // refuel
                for (int j = 0; j < k; ++j) {
                    amount[j] = in.nextInt();
                }
                station.refuel(amount);
            }
            station.print();
        }
    }
}
