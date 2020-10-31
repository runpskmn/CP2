
import java.util.Scanner;

public class W3P4_LongestString3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=-1;
        String longest = "a";
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.length()>=max){
                max = str.length();
                longest = str;
            }
        }
        System.out.println(longest);
    }
}
