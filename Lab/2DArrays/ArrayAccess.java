
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayAccess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> Array = new ArrayList<>();
        int n = sc.nextInt();
        int hit = 0,miss=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;++i){
            ArrayList<Integer> a = new ArrayList<>();
            int k = sc.nextInt();
            for(int j=0;j<k;++j){
                a.add(sc.nextInt());
            }
            Array.add(a);
        }
        while(true){
            int Arr = sc.nextInt();
            if(Arr == 0){
                break;
            }
            int Index = sc.nextInt();
            if(Arr>n || Index >= Array.get(Arr-1).size()){
                ++miss;
            }else{
                int value = Array.get(Arr-1).get(Index);
                hit+=value;
                if(value>max){
                    max = value;
                }
                if(value<min){
                    min = value;
                }
            }
        }
        System.out.println(hit + "\n" + max + "\n"+ min+"\n"+miss);
    }
}
