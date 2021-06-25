
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[1000]; 
       for(int i=0;i<k;++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int type =0;
            for(int j=x;j<y;j++){
                if(A[j]+z>5){
                    type = 1;
                    break;
                }else{
                    A[j]+=z;
                }
            }
            if(type==0){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
     }  
}
