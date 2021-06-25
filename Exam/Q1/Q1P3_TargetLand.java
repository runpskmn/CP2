
import java.util.Scanner;
public class Q1P3_TargetLand {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+1]; 
        for(int i=1;i<=n;i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int price = 0;
            int k = sc.nextInt();
            int m = sc.nextInt();
            int mid = k/2;
            if(m-mid<=0 || m+mid>=n+1){
                System.out.println("no");
            }else{
                price+=A[m];
                for(int j=1;j<=k/2;j++){
                    price+=A[m-j];
                    price+=A[m+j];
                }
                System.out.println(price);
            }
        }
     }  
}
