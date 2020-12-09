
import java.util.Scanner;

class Audience {

    private String[] msg;
    private int count = 0;
    boolean disconnected = false;

    Audience(String[] msg) {
        this.msg = new String[msg.length + 1];
        for (int i = 0; i < msg.length; ++i) {
            this.msg[i] = msg[i];
        }
    }

    boolean isBeautiful() {
        boolean yes  = msg[count].equals("beautiful");
        count = (count+1)%(msg.length-1);
        return yes;
    }
}

public class Beautiful {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String[] phrases = new String[K];
        scan.nextLine();
        for (int i = 0; i < K; ++i) {
            phrases[i] = scan.nextLine();
        }

        final int C = scan.nextInt();
        Audience[] Cs = new Audience[C + 1];
        for (int p = 1; p <= C; ++p) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for (int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            Cs[p] = new Audience(msg);
        }
        for (int i = 0; i < K; ++i) {
            
            if (phrases[i].equals("crack")) {
                boolean found = false;
                for (int j = 1; j <= C; ++j) {
                    if(Cs[j].disconnected)
                        continue;
                    if (!Cs[j].disconnected) {
                        if (!Cs[j].isBeautiful()) {
                            System.out.print(j + " ");
                            Cs[j].disconnected = true;
                            found = true;
                        }
                    }
                }

                if (!found) {
                    System.out.print("x");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= C; ++j) {
                    Cs[j].isBeautiful();
                }
            }
        }
    }
}
