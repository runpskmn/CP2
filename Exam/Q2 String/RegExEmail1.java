
import java.util.Scanner;

public class RegExEmail1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        
        if(mail.indexOf("@")==-1)
            System.out.println("undefined email");
        else{
            System.out.println("username:"+mail.substring(0, mail.indexOf("@")));
            System.out.println("domain:"+mail.substring(mail.indexOf("@")+1,mail.length()));
        }
            
    }
}
