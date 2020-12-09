
import java.util.Scanner;

class Bus {
    String id;
    int type;
    private int seats;
    private int reserved = 0;
    private boolean active = true;
    Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }
    void printStats() {
        System.out.println(id);
        if(type == 1){
            System.out.println("Fan");
        }else if(type ==2){
            System.out.println("P1");
        }else{
            System.out.println("VIP");
        }
        System.out.println(reserved+" "+seats);
        if(active){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
    }
    boolean  reserve(int k){
        if(!active || k+reserved>seats || k<=0){
            return false;
        }else{
            reserved+=k;
            return true;
        }
    }
    void sendToRepair(){
        active = false;
    }
    void backToService(){
        active = true;
    }
}
public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus[] bus = new Bus[Q+1];
        for(int i=1;i<=Q;++i){
            bus[i] = new Bus(sc.next(),sc.nextInt(),sc.nextInt());
        }
        int n =sc.nextInt();
        for(int i=0;i<n;++i){
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();
            if(P==1){
                boolean status = false;
                for(int j=1;j<=Q;++j){
                    if(bus[j].type != T)
                        continue;
                    if(bus[j].reserve(K)){
                        System.out.println(bus[j].id);
                        status = true;
                        break;
                    }
                }
                if(!status)
                    System.out.println("sorry");
            }else if(P==2){
                bus[T].sendToRepair();
            }else{
                bus[T].backToService();
            }
        }
    }
}
