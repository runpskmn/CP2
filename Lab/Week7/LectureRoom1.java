
import java.util.Scanner;


public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LectRoom[] lec = new LectRoom[k];
        for(int i=0;i<k;++i){
            lec[i] = new LectRoom(sc.nextInt(),sc.next(),sc.nextInt());
        }
        int n = sc.nextInt();
        for(int i=0;i<n;++i){
            int classCode = sc.nextInt();
            int seats = sc.nextInt();
            boolean status=false;
            for(int j=0;j<k;++j){
                if(lec[j].classCode == classCode){
                    if(lec[j].reserveSeats(seats)){
                        System.out.println(lec[j].name);
                        status = true;
                        break;
                    }
                }
            }
            if(!status){
                System.out.println("sorry");
            }
        }
    }
}

class LectRoom {

    int classCode, capacity;
    String name;
    int currentSeats = 0;

    LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int seats) {
        if (seats + currentSeats > capacity) {
            return false;
        } else {
            currentSeats += seats;
            return true;
        }
    }
}
