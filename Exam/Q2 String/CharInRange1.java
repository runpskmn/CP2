
import java.util.Scanner;

public class CharInRange1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int a1 = a.charAt(0);
        int a2 = a.charAt(2);
        int b1 = b.charAt(0);
        int b2 = b.charAt(2);
        int c1 = c.charAt(0);
        int c2 = c.charAt(2);
        for (int i = 0; i < 3; ++i) {
            char ch = sc.next().charAt(0);
            int chh = ch;
            boolean t = true;
            if (a2 < a1) {
                if (chh >= a2 && chh <= a1) {
                    System.out.print("1" + " ");
                    t = false;
                }
            } else if (chh >= a1 && chh <= a2) {
                System.out.print("1" + " ");
                t = false;
            }
            if (b2 < b1) {
                if (chh >= b2 && chh <= b1) {
                    System.out.print("2" + " ");
                    t = false;
                }
            } else if (chh >= b1 && chh <= b2) {
                System.out.print("2" + " ");
                t = false;
            }
            if (c2 < c1) {
                if (chh >= c2 && chh <= c1) {
                    System.out.print("3" + " ");
                    t = false;
                }
            } else if (chh >= c1 && chh <= c2) {
                System.out.print("3" + " ");
                t = false;
            }
            if(t){
                System.out.print("0");
            }
            System.out.println("");
        }

    }
}
