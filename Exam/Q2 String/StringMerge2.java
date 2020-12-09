
import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len;
        if(str1.length()<str2.length()){
            len = str1.length();
        }else{
            len = str2.length();
        }
        for(int i=0;i<len;++i){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            boolean up_c1 = Character.isUpperCase(c1);
            boolean up_c2 = Character.isUpperCase(c2);
            boolean low_c1 = Character.isLowerCase(c1);
            boolean low_c2 = Character.isLowerCase(c2);
            boolean num_c1 = Character.isDigit(c1);
            boolean num_c2 = Character.isDigit(c2);
            boolean sp_c1 = false;
            boolean sp_c2 = false;
            if(!up_c1 && !low_c1 && !num_c1){
                sp_c1 = true;
            }else if(!up_c2 && !low_c2 && !num_c2){
                sp_c2 = true;
            }
            if(sp_c1 && sp_c2){
                System.out.print(c1);
            }else if(sp_c1){
                System.out.print(c1);
            }else if(sp_c2){
                System.out.print(c2);
            }else if(num_c1 && num_c2){
                System.out.print(c1);
            }else if(num_c1){
                System.out.print(c1);
            }else if(num_c2){
                System.out.print(c2);
            }else if(up_c1 && up_c2){
                System.out.print(c1);
            }else if(up_c1){
                System.out.print(c1);
            }else if(up_c2){
                System.out.print(c2);
            }else{
                System.out.print(c1);
            }
        }
    }
}
