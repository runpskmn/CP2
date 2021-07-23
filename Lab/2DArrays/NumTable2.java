
import java.util.Scanner;

public class NumTable2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int lastNum = -1;
        boolean newLine = true;
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > 0 && x <= r && y > 0 && y <= c) {
                if (lastNum != a[x - 1][y - 1]) {
                    System.out.print(a[x - 1][y - 1]);
                } else {
                    System.out.print("*");
                }
                lastNum = a[x - 1][y - 1];
                newLine = false;
            } else {
                if (!newLine) {
                    System.out.println();
                    newLine = true;
                    lastNum = -1;
                }
            }
        }
    }
}
