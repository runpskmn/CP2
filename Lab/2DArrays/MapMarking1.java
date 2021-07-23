
import java.util.Scanner;

public class MapMarking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] map = new int[r+1][c+1];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
        map[x][y] = 1;
        for(int i=0;i<n;++i){
            int order = sc.nextInt();
            if(order == 1){
                if(map[x][y-1]!=1){
                    map[x][y-1] = 1;
                    count++;
                }
                y = y-1;
            }else if(order == 2 && y<c){
                if(map[x][y+1]!=1){
                    map[x][y+1] = 1;
                    count++;
                }
                y = y+1;
            }else if(order == 3 && x>1){
                if(map[x-1][y]!=1){
                    map[x-1][y] = 1;
                    count++;
                }
                x = x-1;
            }else if(order == 4 && x<r){
                if(map[x+1][y]!=1){
                    map[x+1][y] = 1;
                    count++;
                }
                x = x+1;
            }
        }
        System.out.println(x+" "+y+"\n"+count);
    }
}
