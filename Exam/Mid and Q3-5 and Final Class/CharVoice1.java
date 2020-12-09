
import java.util.Scanner;


//class Character {
    String[] msg;
    int count = 0;
    Character(String[] msg){
        this.msg = new String[msg.length+1];
        for(int i=0;i<msg.length;++i){
            this.msg[i] = msg[i];
        }
    }
    void speak(){
        if(count==msg.length-1)
            count=0;
        System.out.println(msg[count]);
        count++;
    }
}

public class CharVoice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int c = scan.nextInt();
        final int N = scan.nextInt();
        String[] msg = new String[N];
        scan.nextLine(); // Skip end-line char
        for (int i = 0; i < N; ++i) {
            msg[i] = scan.nextLine();
        }
        Character chars = new Character(msg);
        int k = scan.nextInt();
        for(int i=0;i<k;++i){
            chars.speak();
        }
    }
}
