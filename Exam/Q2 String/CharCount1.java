
import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] A = new int[100];
        for(int i=0;i<str.length();++i){
            int point = str.charAt(i);
            A[point-65]++;
        }
        for(int i=0;i<26;++i){
            if(A[i]>0){
                int alpha = i+65;
                System.out.println((char)alpha+" "+A[i]);
            }
        }
    }
}
