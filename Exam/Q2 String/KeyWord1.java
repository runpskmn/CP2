
import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int count=0;
        for(int i=0;i<n;++i){
            String x = sc.next();
            boolean check = true;
            for(int j=0;j<=count;++j){
                if(x.equals(str[j])){
                    check = false;
                }
            }
            if(check){
                str[count] = x;
                count++;
            }
        }
        for(int i=0;i<count;++i){
            System.out.print(str[i]+" ");
        }
    }
}
