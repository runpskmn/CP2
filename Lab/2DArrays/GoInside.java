
import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
       if(str.length()<=1)
           return str;
       int length = str.length();
       String subAns = goInside(str.substring(1,length-1),!front);
       if(front)
           return str.charAt(0)+(str.charAt(length-1)+subAns);
       else{
           return str.charAt(length-1)+(str.charAt(0)+subAns);
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
