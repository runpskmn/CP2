
import java.util.Scanner;


public class PalindromeMaker {

    String makePalindrome(String str) {
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(text);
        System.out.println(result);
    }
}
