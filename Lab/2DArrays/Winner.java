
import java.util.Scanner;

public class Winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int ship = 0,first = -1,last = 0;
        int hit = 0, mis_in = 0, repeat = 0, mis_in_re = 0, mis_out = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1){
                    ship++;
                }
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x >= 1 && x <= r && y >= 1 && y <= c) {
                if (a[x - 1][y - 1] == 1) {
                    hit++;
                    a[x - 1][y - 1]++;
                    if(first == -1){
                        first = i+1;
                    }
                    last = i+1;
                } else if (a[x - 1][y - 1] == 2) {
                    repeat++;
                } else if (a[x - 1][y - 1] == 0) {
                    mis_in++;
                    a[x - 1][y - 1] += 3;
                } else if (a[x - 1][y - 1] == 3) {
                    mis_in_re++;
                }
            } else {
                mis_out++;
            }
        }
        System.out.println(hit+"\n"+mis_in+"\n"+repeat+"\n"+mis_in_re+"\n"+mis_out);
        if(ship == hit){
            System.out.println("attacker " + last);
        }else{
            System.out.println("battleship "+ first);
        }
    }
}
