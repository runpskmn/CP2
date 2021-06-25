
import java.util.Scanner;

public class ConsecSale {
   public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);
       int n = sc.nextInt();
       int p = sc.nextInt();
       int k = sc.nextInt();
       int[] a = new int [n+1];
       for(int i=0;i<k;++i){
           int x = sc.nextInt();
           if(x>=p && x<=p+n){
               a[x-p]++;
           }
       }
       int cosec = 0;
       int notbuy = 0;
       int max = -1;
       for(int i=1;i<n;++i){
           if(a[i] == 0 && a[i-1] == 0){
               cosec++;
           }else{
               cosec=0;
           }
           if(a[0] == 0 || a[i] == 0){
               notbuy++;
           }
           if(cosec > max){
               max = cosec;
           }
       }
       System.out.println(notbuy);
       if(max == 0){
           System.out.println(max);
       }else{
           System.out.println(max+1);
       }
   } 
}
