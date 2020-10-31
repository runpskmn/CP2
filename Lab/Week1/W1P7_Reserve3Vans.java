
import java.util.Scanner;

public class W1P7_Reserve3Vans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(a<=b && b<=c){
                System.out.println("A");
                a+=x;
            }else if(b<a && b<=c){
                System.out.println("B");
                b+=x;
            }else if(c<a && c<b){
                System.out.println("C");
                c+=x;
            }
        }
    }
}
