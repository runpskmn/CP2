
import java.util.Scanner;

public class W3P2_LongestString1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=-1;
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.length()>max){
                max = str.length();
            }
        }
        System.out.println(max);
    }
}
