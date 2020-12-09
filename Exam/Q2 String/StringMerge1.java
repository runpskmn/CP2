
import java.util.Scanner;

public class StringMerge1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int k = sc.nextInt();
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
            if(up_c1 && !up_c2){
                System.out.print(c1);
            }else if(up_c2 && !up_c1){
                System.out.print(c2);
            }else{
                if(k==1){
                    System.out.print(c1);
                }else{
                    System.out.print(c2);
                }
            }
        }
     }
}
