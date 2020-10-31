
import java.util.Scanner;

public class W2P3_TeamCompetition {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A = new int[1000];
      int[] B = new int[1000];
      int pointA=0,pointB=0;
      for(int i =0;i<n;i++){
          A[i] = sc.nextInt();
      }
      for(int i=0;i<n;i++){
          B[i] = sc.nextInt();
      }
      for(int i=0;i<n;i++){
          if(A[i]>B[i]){
              pointA+=2;
          }else if(B[i]>A[i]){
              pointB+=2;
          }else{
              pointA++;
              pointB++;
          }
      }
      if(pointA>pointB){
          System.out.println("Team 1 wins");
          System.out.println("Score " + pointA + " to " + pointB);
      }else if(pointB>pointA){
          System.out.println("Team 2 wins");
          System.out.println("Score " + pointB + " to " + pointA);
      }else{
          System.out.println("Draw game");
          System.out.println("Score " + pointA + " to " + pointB);
      }
  }  
}
