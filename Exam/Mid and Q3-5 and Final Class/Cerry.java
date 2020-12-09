
import java.util.Scanner;

class Ship {
    int capacity;
    int currentWeight = 0;
    
    Ship(int capacity){
        if(capacity >0)
            this.capacity = capacity;
        else
            this.capacity = 10;
    }
    int load(int[] weight,int p1){
        int p = p1;
        for(int i=p1;i<weight.length;++i){
            if(weight[i]+currentWeight>capacity){
                p = i;
                break;
            }else{
                currentWeight+=weight[i];
                p= i+1;
            }
        }
        return p;
    }
}

public class Cerry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Ship[] ship = new Ship[m];
        for (int i = 0; i < m; i++) {
            int cap = in.nextInt();
            ship[i] = new Ship(cap);
        }
        int p1 = 0;
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
        }
        for(int i=0;i<m;++i){
            p1 = ship[i].load(weight, p1);
        }
        // Do not change the following lines.
        System.out.print(p1 + " ");
        int sum_weight = 0;
        for (int i = 0; i < p1; i++) {
            sum_weight += weight[i];
        }
        System.out.println(sum_weight);
    }
}
