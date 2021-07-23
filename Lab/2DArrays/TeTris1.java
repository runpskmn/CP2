
import java.util.Scanner;

public class TeTris1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] board = new int[col+1][row+1];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int target = sc.nextInt();
        if(c==1)
            board[col][target] = 1;
        if(a==1)
            board[col-1][target] = 1;
        if(b==1)
            board[col-1][target+1] = 1;
        if(d==1)
            board[col][target+1] = 1;
        for(int i=1;i<=col;++i){
            for(int j=1;j<=row;++j){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
