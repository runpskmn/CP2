
import java.util.Scanner;

public class W2P2_Vote {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] A = new int[n+10];
      int max=-1;
      int keep=0;
      for(int i=1;i<=k;i++){
          int x = sc.nextInt();
          A[x]++;
      }
      for(int i=1;i<=n;i++){
          if(A[i]>max){
              max = A[i];
              keep=i;
          }
      }
      System.out.println(keep);
      System.out.println(max);
  }  
}
