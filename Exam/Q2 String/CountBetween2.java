
import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int Upper =0;
        int Lower =0;
        int Other=0;
        for(int i=0;i<len;++i){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                Upper++;
            }else if(Character.isLowerCase(ch)){
                Lower++;
            }else{
                Other++;
            }
        }
        System.out.println(Lower);
        System.out.println(Upper);
        System.out.println(Other);
    }
}
