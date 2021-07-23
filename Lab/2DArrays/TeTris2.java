
import java.util.Scanner;

public class TeTris2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] board = new int[col + 1][row + 1];
        int n = sc.nextInt();
        for (int k = 0; k < n; ++k) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int target = sc.nextInt();
            int newCol=col;
            for (int i = col; i > 0; --i) {
                for (int j = target; j <= target+1; ++j) {
                    if(board[i][j]==1)
                        newCol = i-1;
                }
                System.out.println();
            }
            if (c == 1) {
                board[newCol][target] = 1;
            }
            if (a == 1) {
                board[newCol - 1][target] = 1;
            }
            if (b == 1) {
                board[newCol - 1][target + 1] = 1;
            }
            if (d == 1) {
                board[newCol][target + 1] = 1;
            }
            for (int i = 1; i <= col; ++i) {
                for (int j = 1; j <= row; ++j) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
