
import java.util.Scanner;

class Bus1 {
    String id;
    int type;
    int seats;
    int reserveSeats = 0;
    boolean active = true;
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
        System.out.println(reserveSeats+" "+seats);
        if(active){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
    }
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();

    }
}
