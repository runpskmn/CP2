
import java.util.Scanner;

public class ShrinkAndExpand {

    String shrinkAndExpand(String s) {
        if(s.length()<=1)
            return s+s;
        char c1 = s.charAt(0);
        char c2 = s.charAt(1);
        
        if(c1==c2)
            return c1+shrinkAndExpand(s.substring(2));
        else{
            String ss = s.substring(0,1);
            return ss+ss+shrinkAndExpand(s.substring(1));
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}
