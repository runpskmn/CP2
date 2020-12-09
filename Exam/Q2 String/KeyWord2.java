
import java.util.Scanner;

public class KeyWord2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] C = new int[n];
        int count=0;
        for(int i=0;i<n;++i){
            String x = sc.next();
            boolean check = true;
            for(int j=0;j<=count;++j){
                if(x.equals(str[j])){
                    check = false;
                    C[j]++;
                }
            }
            if(check){
                str[count] = x;
                C[count] = 1;
                count++;
            }
        }
        int max = -1;
        int target;
        for(int i=0;i<count;++i){
            System.out.print(str[i]+" ");
            if(C[i]>max){
                max = C[i];
                target=i;
            }
        }
        System.out.println("");
        System.out.print(max + " ");
        for(int i=0;i<count;++i){
            if(C[i]==max){
                System.out.print(str[i]+" ");
            }
        }
    }
}
