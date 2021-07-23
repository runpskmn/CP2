
import java.util.Scanner;

public class OnlyOne3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arrays = new int[r][c];
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                arrays[i][j] = sc.nextInt();
            }
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        col = col-1;
        row = row-1;
        if(row<0)
            row = 0;
        else if(row>=r)
            row = r-1;
        if(col<0)
            col = 0;
        else if(col>=c)
            col = c-1;
        int count =0;
        for(int i=0;i<r;++i){
            if(arrays[i][col]==1)
                count++;
        }
        for(int i=0;i<c;++i){
            if(arrays[row][i]==1)
                count++;
        }
        if(arrays[row][col]==1)
            count--;
        System.out.println(count);
    }
}
