
import java.util.Scanner;

public class W3P6_LongestCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=-1,count=0;
        while(true){
            String str = sc.nextLine();
            if(str.length()==0){
                break;
            }
            if(str.length()==max){
                count++;
            }
            if(str.length()>max){
                max = str.length();
                count=1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
