
import java.util.Scanner;


public class http {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while(true){
            if(str.indexOf("/")==-1)
                break;
            else
                str = str.substring(0, str.indexOf("/"))+"%2f"+str.substring(str.indexOf("/")+1, str.length());
        }
        System.out.println(str);
    }
}
