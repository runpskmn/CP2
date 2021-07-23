
import java.util.Scanner;

public class StartBattle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int hit = 0, mis_in = 0, repeat = 0, mis_in_re = 0, mis_out = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x >= 1 && x <= r && y >= 1 && y <= c) {
                if (a[x-1][y-1] == 1) {
                    hit++;
                    a[x-1][y-1]++;
                } else if (a[x-1][y-1] == 2) {
                    repeat++;
                }else if(a[x-1][y-1]==0){
                    mis_in++;
                    a[x-1][y-1]+=3;
                }else if (a[x-1][y-1] == 3) {
                    mis_in_re++;
                }
            }else{
                mis_out++;
            }
        }
        System.out.println(hit);
        System.out.println(mis_in);
        System.out.println(repeat);
        System.out.println(mis_in_re);
        System.out.println(mis_out);
    }
}
