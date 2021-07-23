
import java.util.Scanner;

public class OnlyOne1 {
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
        int max = -1;
        int col =0;
        for(int i=0;i<c;++i){
            int count = 0;
            for(int j=0;j<r;++j){
                if(arrays[j][i]==1)
                    count++;
            }
            if(count >= max){
                max = count;
                col = i+1;
            }
        }
        System.out.println(max+"\n"+col);
    }
}
