
import java.util.Scanner;

public class W1P8_TheVoiceSU {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int s_p1=0,s_p2=0;
       for(int i=0;i<n;i++){
           int sex = sc.nextInt();
           int p1 = sc.nextInt();
           int p2 = sc.nextInt();
           if(sex ==1){
               if(s_p1<k && p1>=9){
                    System.out.println(i+1 + " 1");
                    s_p1++;
                }else if(s_p2<k && p2>=9){
                    System.out.println(i+1 + " 2");
                    s_p2++;
                }
           }else{
               if(s_p2<k && p2>=9){
                    System.out.println(i+1 + " 2");
                    s_p2++;
                }else if(s_p1<k && p1>=9){
                    System.out.println(i+1 + " 1");
                    s_p1++;
                }
           }
       }
   } 
}
