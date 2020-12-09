
import java.util.Scanner;

public class CharWatch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        char char3 = sc.next().charAt(0);
        final int k = sc.nextInt();
        String[] str = new String[k];
        for (int i = 0; i < k; ++i) {
            str[i] = sc.next();
        }
        final int n = sc.nextInt();
        int[] a = new int[4];
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            for (int j = 0; j < k; ++j) {
                int len = str[j].length();
                if (x > 0 && x <= len) {
                    char ch = str[j].charAt(x - 1);
                    if (ch == char1) {
                        a[0]++;
                    } else if (ch == char2) {
                        a[1]++;
                    } else if (ch == char3) {
                        a[2]++;
                    }
                }
            }
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println(a[i]);
        }
    }
}
