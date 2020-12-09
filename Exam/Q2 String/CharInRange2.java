
import java.util.Scanner;

public class CharInRange2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int a1 = a.charAt(0);
        int a2 = a.charAt(2);
        int b1 = b.charAt(0);
        int b2 = b.charAt(2);
        int c1 = c.charAt(0);
        int c2 = c.charAt(2);
        int c_inrange =0,c_out =0,score=0;
        String str = sc.next();
        for(int i=0;i<str.length();++i){
            int ch = str.charAt(i);
            boolean t = true;
            if (a2 < a1) {
                if (ch >= a2 && ch <= a1) {
                    score++;
                    t = false;
                }
            } else if (ch >= a1 && ch <= a2) {
                score++;
                t = false;
            }
            if (b2 < b1) {
                if (ch >= b2 && ch <= b1) {
                    score++;
                    t = false;
                }
            } else if (ch >= b1 && ch <= b2) {
                score++;
                t = false;
            }
            if (c2 < c1) {
                if (ch >= c2 && ch <= c1) {
                    score++;
                    t = false;
                }
            } else if (ch >= c1 && ch <= c2) {
                score++;
                t=false;
            }
            if(t){
                c_out++;
                score-=2;
            }else{
                c_inrange++;
            }
        }
        System.out.println(c_inrange);
        System.out.println(c_out);
        System.out.println(score);
    }
}
