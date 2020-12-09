
import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        char char3 = sc.next().charAt(0);
        String blank = sc.nextLine();
        String str = sc.nextLine();
        int n = sc.nextInt();
        int[] a = new int[4];
        for(int i=0;i<n;++i){
            int x = sc.nextInt();
            int len = str.length();
            if(x>0 && x<=len){
                char ch = str.charAt(x-1);
                if(ch == char1){
                    a[0]++;
                }else if(ch == char2){
                    a[1]++;
                }else if(ch == char3){
                    a[2]++;
                }
            }else{
                a[3]++;
            }     
        }
        for(int i=0;i<4;++i){
            System.out.println(a[i]);
        }
    }
}
