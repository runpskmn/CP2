
import java.util.Scanner;

public class W1P6_OddVsEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int odd=0,even=0;
        int s_odd=0,s_even=0;
        for(int i=0;i<8;i++){
            int x = sc.nextInt();
            if(x%2==0){
                even++;
                s_even+=x;
            }else{
                odd++;
                s_odd+=x;
            }
        }
        if(even>odd){
            System.out.println("even");
        }else if(odd>even){
            System.out.println("odd");
        }else{
            System.out.println("equal");
        }
        System.out.println(s_even);
        System.out.println(s_odd);
    }
}
