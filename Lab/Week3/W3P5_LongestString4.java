
import java.util.Scanner;

public class W3P5_LongestString4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=-1;
        String longest = "a";
        while(true){
            String str = sc.nextLine();
            if(str.length()==0){
                break;
            }
            if(str.length()>=max){
                max = str.length();
                longest = str;
            }
        }
        System.out.println(longest);
    }
}
