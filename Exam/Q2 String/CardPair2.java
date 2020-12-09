
import java.util.Scanner;

public class CardPair2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            String p1 = sc.next();
            String p2 = sc.next();
            int c1p1 = p1.charAt(0);
            int c2p1 = p1.charAt(1);
            int c1p2 = p2.charAt(0);
            int c2p2 = p2.charAt(1);
            int card_p1;
            int card_p2;
            if (c1p1 == c2p1 && c1p2 != c2p2) {
                System.out.print("W");
            } else if (c1p2 == c2p2 && c1p1 != c2p1) {
                System.out.print("L");
            } else {
                if (c1p1 < c2p1) {
                    card_p1 = c1p1;
                } else {
                    card_p1 = c2p1;
                }
                if (c1p2 < c2p2) {
                    card_p2 = c1p2;
                } else {
                    card_p2 = c2p2;
                }
                if (card_p1 < card_p2) {
                    System.out.print("W");
                } else if (card_p2 < card_p1) {
                    System.out.print("L");
                } else {
                    System.out.print("D");
                }
            }
        }
    }
}
