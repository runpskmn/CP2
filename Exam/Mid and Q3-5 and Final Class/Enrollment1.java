
import java.util.Scanner;

/*class Course {
    
    String name;
    int n;
    int[] id;
    int currentSeat =0;
    
    Course(String name,int n){
        this.name = name;
        this.n = n;
        id = new int[n];
    }
    
    boolean enroll(int id){
        boolean found = true;
        for(int i=0;i<n;++i){
            if(id == this.id[i] || currentSeat >= n){
                found = false;
                break;
            }
        }
        if(found){
            this.id[currentSeat] = id;
            currentSeat++;
        }
        return found;
    }
    
    void printInfo(){
        System.out.println(name+" "+currentSeat);
        for(int i=0;i<currentSeat;++i){
            System.out.println(id[i]);
        }
    }
}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
