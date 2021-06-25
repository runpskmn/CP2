
import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[1000];
        int[] B = new int[1000];
        int[] C = new int[1000];
        for(int i=1;i<=n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            B[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            C[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int price = 0,flag=0,power=0;
            int k = sc.nextInt();
            int m = sc.nextInt();
            if((k/2)>m-1|| (k/2)>n-m){
                System.out.print("no ");
                price+=A[m];
                for(int j=1;j<=k/2;j++){
                    price+=A[m-j];
                    price+=A[m+j];
                }
                System.out.println(price);
            }else{
                price+=A[m];
                for(int j=1;j<=k/2;j++){
                    price+=A[m-j];
                    price+=A[m+j];
                    if(B[m-j]<5 || B[m]<5 || B[m+j]<5){
                        flag++;
                    }
                }
                for(int j=1;j<=k/2;j++){
                    if(C[m-j]>0 || C[m]>0 || C[m+j]>0){
                        power=1;
                        break;
                    }
                }
                if(flag>0){
                    if(power ==0){
                        System.out.println(price);
                    }else{
                        System.out.println(price + " power");
                    }
                }else{
                    if(power ==0){
                        System.out.println(price + " labor");
                    }else{
                        System.out.println(price + " labor power");
                    }
                }
            }
        }
    }
}
