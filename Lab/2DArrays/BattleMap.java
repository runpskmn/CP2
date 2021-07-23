
import java.util.Scanner;

public class BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        System.out.println(n);
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
