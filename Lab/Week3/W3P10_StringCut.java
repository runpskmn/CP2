
import java.util.Scanner;

public class W3P10_StringCut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        char c = s.charAt(0);
        boolean found = false;
        boolean last = false;
        while (true) {
            if(str.lastIndexOf(c) == str.length())
                last = true;
            if (str.indexOf(c) == -1 || str.length() ==0) {
                if(!found)
                    System.out.println("no target character found");
                break;
            } else {
                found = true;
                if (str.charAt(0) != c) {
                    System.out.println(str.substring(0, str.indexOf(c)));
                }
                str = str.substring(str.indexOf(c) + 1, str.length());
            }
        }
        if(str.length()!=0 && found)
            System.out.println(str);
        else if(str.length()==0 && last)
            System.out.println("no output");
    }
}
