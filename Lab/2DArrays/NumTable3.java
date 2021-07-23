
import java.util.Scanner;

public class NumTable3 {

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
        int max = -1,count = 0;
        boolean newLine = true;
        int length = 0;
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > 0 && x <= r && y > 0 && y <= c) {
                length++;
                newLine = false;
            } else {
                if (!newLine) {
                    newLine = true;
                    length = 0;
                }
            }
            if(length > max){
                max = length;
                count = 1;
            }else if(max == length){
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
