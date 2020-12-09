
import java.util.Scanner;

class Character {

    String[] msg;
    int count = 0;

    Character(String[] msg) {
        this.msg = new String[msg.length + 1];
        for (int i = 0; i < msg.length; ++i) {
            this.msg[i] = msg[i];
        }
    }

    void speak() {
        count = count%(msg.length-1);
        System.out.println(msg[count]);
        count++;
    }
}

public class CharVoice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int c = scan.nextInt();
        Character[] chars = new Character[c + 1];
        for (int j = 1; j <= c; ++j) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine(); // Skip end-line char
            for (int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            chars[j] = new Character(msg);

        }
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int command = scan.nextInt();
            chars[command].speak();
        }
    }
}
