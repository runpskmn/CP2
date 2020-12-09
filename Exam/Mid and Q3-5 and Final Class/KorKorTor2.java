
import java.util.Scanner;


class Precinct{
    
    String PollStation;
    String[] partyName;
    int n;
    int[] vote;
    int max = 0;
    Precinct(String PollStaion,String[] partyName){
        this.PollStation = PollStaion;
        this.n = partyName.length-1;
        this.partyName = new String[n+1];
        for(int i=1;i<=n;++i){
            this.partyName[i] = partyName[i];
        }
        vote = new int[n+1];
    }
    void count(int p){
        if(p>=1 && p<=n){
            vote[p]++;
            System.out.println(partyName[p]+" "+vote[p]);
            if(vote[p]>max)
                max = vote[p];
        }else{
            System.out.println("invalid number");
        }
    }
    void printInfo(){
        for(int i=1;i<=n;++i){
            System.out.println(i+" "+partyName[i]+" "+vote[i]);
        }
    }
    void printMax(){
        for(int i=1;i<=n;++i){
            if(max == vote[i]){
                System.out.println(i+" "+partyName[i]+" "+vote[i]);
            }
        }
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PollStaion = sc.next();
        int n = sc.nextInt();
        String[] partyName = new String[n+1];
        for(int i=1;i<=n;++i){
            partyName[i] = sc.next();
        }
        Precinct pre = new Precinct(PollStaion,partyName);
        int k =sc.nextInt();
        for(int i=0;i<k;++i){
            int x = sc.nextInt();
            if(x==2){
                pre.printInfo();
            }else if(x==3){
                pre.printMax();
            }else{
                int p = sc.nextInt();
                pre.count(p);
            }
        }
    }
}
