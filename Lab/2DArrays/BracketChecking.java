
import java.util.Scanner;

public class BracketChecking {

    public static boolean CheckBracket(String s) {
        boolean status = false;
        boolean haveOBracket = false;
        int targetO, targetL;
        boolean haveLBracket = false;
        targetO = s.indexOf('{');
        targetL = s.lastIndexOf('}');
        if (targetO > -1) {
            haveOBracket = true;
        }
        if (targetL > -1) {
            haveLBracket = true;
        }
        if (haveOBracket && haveLBracket) {
            String s0 = "", s1 = "", s2 = "";
            s0 = s.substring(0, Math.min(targetO, targetL));
            s1 = s.substring(Math.min(targetO, targetL) + 1, Math.max(targetO, targetL));
            if(s.length() > Math.min(targetO, targetL));
                s2 = s.substring(Math.max(targetO, targetL)+1, s.length());
            return CheckBracket(s0+s1+s2);
        }else if(!haveOBracket && !haveLBracket){
            return true;
        }else{
            return false;
        }
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(CheckBracket(str));
    }
}
