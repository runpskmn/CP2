
import java.util.Scanner;

public class MapMarking2 {
    static int GoLeft(int[][] map,int x,int y,int c){
        int col = y-1;
        if(col==0)
            col = c;
        while(map[x][col]==1){
            if(col==y)
                return -1;
            --col;
            if(col==0)
                col = c;
        }
        return col;
    }
    static int GoRight(int[][] map,int x,int y,int c){
        int col = y+1;
        if(col>c)
            col = 1;
        while(map[x][col]==1){
            if(col==y)
                return -1;
            ++col;
            if(col>c)
                col = 1;
        }
        return col;
    }
    static int GoUp(int[][] map,int x,int y,int r){
        int row = x-1;
        if(row==0)
            row = r;
        while(map[row][y]==1){
            if(row==x)
                return -1;
            --row;
            if(row==0)
                row = r;
        }
        return row;
    }
    static int GoDown(int[][] map,int x,int y,int r){
        int row = x+1;
        if(row>r)
            row = 1;
        while(map[row][y]==1){
            if(row==x)
                return -1;
            ++row;
            if(row>r)
                row = 1;
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] map = new int[r+2][c+2];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
        map[x][y] = 1;
        for(int i=0;i<n;++i){
            int order = sc.nextInt();
            if(order ==1 || order ==2){
                int newCol = (order ==1)? GoLeft(map,x,y,c):
                        GoRight(map,x,y,c);
                if(newCol != -1){
                    y = newCol;
                    ++count;
                    map[x][y]=1;
                }
            }else if(order==3 || order == 4){
                int newRow = (order == 3)? GoUp(map,x,y,r):
                        GoDown(map,x,y,r);
                if(newRow != -1){
                    x = newRow;
                    ++count;
                    map[x][y]=1;
                }
            }
        }
        System.out.println(x+" "+y+"\n"+count);
    }
}
