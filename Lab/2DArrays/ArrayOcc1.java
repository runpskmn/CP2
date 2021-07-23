
import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrays = new int[n];
        int k = sc.nextInt();
        int success =0,out =0,fail=0;
        int max = -1;
        for(int i=0;i<k;++i){
            int x = sc.nextInt();
            if(x>=1 && x<=n){
                if(arrays[x-1]>0)
                    fail++;
                else
                    success++;
                arrays[x-1]++;
            }else
                out++;
        }
        for(int i=0;i<n;++i){
            if(arrays[i]>max)
                max = arrays[i];
        }
        System.out.println(success);
        System.out.println(out);
        System.out.println(fail);
        for(int i=0;i<n;++i){
            if(arrays[i]==max)
                System.out.print(i+1+" ");
        }
    }
}
