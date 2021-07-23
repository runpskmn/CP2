
import java.util.Scanner;

public class ColumnSummary {

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
        int SpotR = HPRaw(r, c, a, n);
        int SpotC = HPCol(r, c, a, n);
        int sum = SpotR + SpotC - 1;
        System.out.println(sum);
        for (int i = 0; i < r; ++i) {
            int cR=checkR(a, SpotR, c, n, i);
            for(int j=0;j<c;++j) {
                int cC = checkC(a, SpotR, r, n, j);
                if(cR==SpotR && cC==SpotC){
                    System.out.println((i+1)+" "+(1+j));
                }
            }
        }
    }

    static int HPRaw(int r, int c, int[][] a, int n) {
        int count = 0;
        int max = -1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; ++j) {
                if (a[i][j] == n) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }

    static int HPCol(int r, int c, int[][] a, int n) {
        int count = 0;
        int max = -1;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; ++j) {
                if (a[j][i] == n) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }

    static int checkR(int[][] a, int SpotR, int c, int n, int start) {
        int count = 0;
        for (int j = 0; j < c; ++j) {
            if (a[start][j] == n) {
                count++;
            }
        }
        return count;
    }
    static int checkC(int[][] a, int SpotR, int r, int n, int start) {
        int count = 0;
        for (int j = 0; j < r; ++j) {
            if (a[j][start] == n) {
                count++;
            }
        }
        return count;
    }
}
