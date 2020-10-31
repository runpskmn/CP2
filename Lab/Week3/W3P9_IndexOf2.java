
import java.util.Scanner;

public class W3P9_IndexOf2 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        int count =0;
        int[] a = new int[100];
        int point=0;
        for(int i=point;i<str.length();++i){
            int index = str.indexOf(s,i);
            point = str.indexOf(s,i);
            System.out.println(index+1+" ");
        }
    }
}
