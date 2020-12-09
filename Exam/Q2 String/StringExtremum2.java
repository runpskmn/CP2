
import java.util.Scanner;

public class StringExtremum2 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String blank = sc.nextLine();
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        int max =-1;
        int min = 1001;
        String a = " ";
        while(true){
            String str = sc.nextLine();
            int index1 = str.indexOf(p1);
            int index2 = str.indexOf(p2);
            if(str.length()==0){
                break;
            }
            if(k==1){
                if(index1 > -1 || index2 > -1){
                    if(str.length()>=max){
                        max = str.length();
                        a = str;
                    }
                }
            }else{
                if(index1 > -1 || index2 > -1){
                    if(str.length()<=min){
                        min = str.length();
                        a = str;
                    }
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
