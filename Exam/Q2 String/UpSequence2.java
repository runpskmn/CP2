
import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int[] a = new int[len];
        for(int i=0;i<len;++i){
            char ch = str.charAt(i);
            a[i] = (int) ch;
        }
        int start = 0;
        for(int i=0;i<len-1;++i){
            if(a[i]>=a[i+1]){
                System.out.println(str.substring(start, i+1));
                start = i+1;
            }
        }
        System.out.println(str.substring(start, len));
    }
}
