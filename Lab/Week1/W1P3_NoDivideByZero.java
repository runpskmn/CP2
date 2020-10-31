
import java.util.Scanner;

public class W1P3_NoDivideByZero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
       if(z==0){
           System.out.println("cannot divide by zero");
       }else{
           double sum = x+y;
           System.out.println(String.format("%.6f", sum/z));
       }
    }
}
