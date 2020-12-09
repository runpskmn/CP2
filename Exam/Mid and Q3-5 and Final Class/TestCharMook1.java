
import java.util.Scanner;

    //class CharMook{
        String name;
        int sum_Score,n;
        
        CharMook(String name){
            this.name = name;
            sum_Score = 0;
            n =0;
        }
        
        void addScore(int score){
            sum_Score+=score;
            n++;
        }
        
        int avgScore(){
            return sum_Score/n;
        }
    }

public class TestCharMook1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        CharMook[] cm = new CharMook[n+1];
        for(int i=1;i<=n;++i){
            String name = scan.next();
            cm[i] = new CharMook(name);
        }
        int m = scan.nextInt();
        for(int i=0;i<m;++i){
            int store = scan.nextInt();
            int score = scan.nextInt();
            cm[store].addScore(score);
            System.out.println(cm[store].name +" "+cm[store].sum_Score+" "+cm[store].n);
        }
    }
}
