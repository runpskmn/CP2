
import java.util.Scanner;


public class Q1P5_Labor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[1000];
        int[] B = new int[1000];
        for(int i=1;i<=n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            B[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int price = 0;
            boolean flag = true;
            int k = sc.nextInt();
            int m = sc.nextInt();
            int mid = k/2;
            int start = m - mid;
            if(start <= 0){
                start = 0;
            }
            int end = m+mid;
            if(end>n){
                end = n;
            }
            if(m-mid<=0 || m+mid>n){
                System.out.print("no ");
                flag = false;
            }else{
                for(int j=start;j<=end;++j){
                    if(B[j]<5){
                         flag=false;
                    }
                }
            }
            for(int j=start;j<=end;++j){
                price+= A[j];
            }
            System.out.print(price);
            if(flag){
                System.out.print(" labor");
            }
            System.out.println("");
        }
    }
}
