
import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int[] a = new int[len];
        for(int i=0;i<len;++i){
            char ch = str.charAt(i);
            a[i] = (int) ch;
        }
        for(int i=0;i<len-1;++i){
            if(a[i]>=a[i+1]){
                System.out.println((char) a[i]);
            }
        }
        System.out.println((char) a[len-1]);
    }
}
