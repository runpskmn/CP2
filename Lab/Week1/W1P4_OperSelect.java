
import java.util.Scanner;

public class W1P4_OperSelect {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int y = scan.nextInt();
       int z = scan.nextInt();
       if(z==1){
           System.out.println(x+y);
       }else if(z==2){
           System.out.println(x-y);
       }else if(z==3){
           System.out.println(x*y);
       }else if(z==4){
           if(y==0){
               System.out.println("cannot divide by zero");
           }else{
               System.out.println(x/y);
           }
       }else if(z==5){
           if(y==0){
               System.out.println("cannot divide by zero");
           }else{
               System.out.println(x%y);
           }
       }
   } 
}
