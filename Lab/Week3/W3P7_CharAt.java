
import java.util.Scanner;


public class W3P7_CharAt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        n = n-1;
        if(n >= str.length() || n <= 0){
            System.out.println("invlid position");
        }else{
            System.out.println(str.charAt(n));
        }
    }
}
