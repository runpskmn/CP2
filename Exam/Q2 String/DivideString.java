
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char[] Upper = new char[len];
        char[] Lower = new char[len];
        char[] Other = new char[len];
        int c_up =0,c_low=0,c_other=0;
        for(int i=0;i<len;++i){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                Upper[c_up]=ch;
                c_up++;
            }else if(Character.isLowerCase(ch)){
                Lower[c_low]=ch;
                c_low++;
            }else{
                Other[c_other]=ch;
                c_other++;
            }
        }
        for(int i=0;i<c_low;++i){
            System.out.print(Lower[i]);
        }
        System.out.println("");
        for(int i=0;i<c_up;++i){
            System.out.print(Upper[i]);
        }
        System.out.println("");
        for(int i=0;i<c_other;++i){
            System.out.print(Other[i]);
        }
        System.out.println("");
    }
}
