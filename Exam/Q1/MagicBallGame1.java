
import java.util.Scanner;


public class MagicBallGame1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        for(int j=1;j<=n;++j){
                System.out.print(a[j]+" ");
        }
        System.out.println("");
        for(int i=0;i<m*2;++i){
            int x =sc.nextInt();
            if(i%2==0)
                a[x] = 1;
            else
                a[x] = 2;
            for(int j=1;j<=n;++j){
                System.out.print(a[j]+" ");
            }
            System.out.println("");
        }
    }
}
