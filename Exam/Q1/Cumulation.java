
import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[1000];
        for(int i=1;i<=k;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j=x;j<=y;j++){
                A[j]+=z;
            }
            for(int j=1;j<=n-1;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println("");
        }
    }
}
