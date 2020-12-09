
import java.util.Scanner;

public class Domino_Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;++i){
            String m1 = sc.next();
            String m2 = sc.next();
            System.out.print(m1.charAt(0));
            System.out.print(m2.charAt(0)+ " ");
            System.out.print(m1.charAt(0));
            System.out.print(m2.charAt(1)+ " ");
            System.out.print(m1.charAt(1));
            System.out.print(m2.charAt(0)+ " ");
            System.out.print(m1.charAt(1));
            System.out.println(m2.charAt(1));
        }
    }
}
