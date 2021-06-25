
import java.util.Scanner;

public class Q1P4_TargetPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+1]; 
        for(int i=1;i<=n;i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=1;i<=q;i++){
            int price = 0;
            int k = sc.nextInt();
            int m = sc.nextInt();
            int mid = k/2;
            if(m-mid<=0 || m+mid>n){
                System.out.print("no ");
            }
            int start = m - mid;
            if(start <= 0){
                start = 0;
            }
            int end = m+mid;
            if(end>n){
                end = n;
            }
            for(int j=start;j<=end;++j){
                price+= A[j];
            }
            System.out.println(price);
        }
     }   
}
