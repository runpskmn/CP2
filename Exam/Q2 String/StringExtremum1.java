
import java.util.Scanner;



public class StringExtremum1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String blank = sc.nextLine();
        int max =-1;
        int min = 1001;
        String a = " ";
        while(true){
            String str = sc.nextLine();
            if(str.length()==0){
                break;
            }
            if(k==1){
                if(str.length()>=max){
                    max = str.length();
                    a = str;
                }
            }else{
                if(str.length()<=min){
                    min = str.length();
                    a = str;
                }
            }
        }
        if(k==1){
            System.out.println(max);
            System.out.println(a);
        }else{
            System.out.println(min);
            System.out.println(a);
        }
    }
}
