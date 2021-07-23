
import java.util.Scanner;

public class NumTable1 {

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
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > 0 && x <= r && y > 0 && y <= c) {
              System.out.print(a[x - 1][y - 1]);
            } else {
                System.out.print("-");
            }
        }
    }
}
