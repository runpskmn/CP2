
import java.util.Scanner;

public class CondoSale {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n+1];
      for(int i=0;i<k;++i){
          int x = sc.nextInt();
          if(x>=p && x<=p+n){
              a[x-p]++;
          }
      }
      int count =0;
      for(int i=0;i<n;++i){
          if(a[i]>0){
              count++;
          }
      }
      System.out.println(count);
      for(int i=0;i<n;++i){
          if(a[i]>0){
              System.out.println(i+p);
          }
      }
  }
}

