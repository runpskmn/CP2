
import java.util.Scanner;

public class WhereAmI {
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
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                if(a[i][j]==n){
                    System.out.print(n+" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
