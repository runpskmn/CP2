
import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int inArea =0,outArea=0;
        for(int i=0;i<k;++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>=1 && x<=r){
                if(y>=1 && y<=c){
                    inArea++;
                }else{
                    outArea++;
                }
            }else{
                outArea++;
            }
        }
        System.out.println(inArea);
        System.out.println(outArea);
    }
}
