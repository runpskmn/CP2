
import java.util.Scanner;

public class CharCount2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[100];
        int count = 0;
        while (true) {
            boolean status = true;
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); ++i) {
                int point = str.charAt(i);
                a[point - 65]++;
                for (int j = 0; j < 26; ++j) {
                    if (a[j] == k) {
                        int alpha = j + 65;
                        System.out.println((char) alpha);
                        System.out.println(count);
                        status = false;
                        break;
                    }
                }
                if(!status){
                break;
                }
            }
            if(!status){
                break;
            }
            count++;
        }
    }
}
