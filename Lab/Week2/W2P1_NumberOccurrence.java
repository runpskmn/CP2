
import java.util.Scanner;

public class W2P1_NumberOccurrence {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int flag = 0;
       int[] A = new int[n+1];
       for(int i=1;i<=n;i++){
           A[i] = sc.nextInt();
       }
       int k = sc.nextInt();
       for(int i=1;i<=n;i++){
           if(A[i]==k){
               System.out.print(i);
               System.out.print(" ");
               flag++;
           }
       }
       if(flag==0){
           System.out.print("0");
       }
       System.out.println("");
   } 
}
