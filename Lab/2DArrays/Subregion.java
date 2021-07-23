
import java.util.Scanner;

public class Subregion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sizex = sc.nextInt();
        int sizey = sc.nextInt();
        int space_r = r-x+1;
        int space_c = c-y+1;
        if (sizex > space_r || sizey > space_c || x<=0||y<=0) {
            System.out.println("invalid input");
        } else {
            for (int i = x - 1; i < sizex + x - 1; ++i) {
                for (int j = y - 1; j < sizey + y - 1; ++j) {
                    a[i][j] = 1;
                }
            }
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
