
import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(p<65 || p>90){
            System.out.println("unsupported code");
        }else{
            System.out.println((char) p);
        }
    }
}
