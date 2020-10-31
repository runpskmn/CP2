
import java.util.Scanner;

public class Tumbol2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int AllBudget = 0;
        TumbolI[] tum = new TumbolI[k];
        for (int i = 0; i < k; ++i) {
            tum[i] = new TumbolI(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for (int j = 0; j < k; ++j) {
            boolean flag = false;
            int n = sc.nextInt();
            for (int i = 1; i <= n; ++i) {
                int budget = sc.nextInt();
                if (tum[j].allocateBudget(budget) == 1) {
                    System.out.print(i + " ");
                    AllBudget += budget;
                    flag = true;
                }
            }
            if (!flag) {
                System.out.print("none");
            }
            System.out.println();
        }
        System.out.println(AllBudget);
    }
}

class TumbolI {

    String name;
    int x, y, people;
    int avialBudget;
    int currentBudget = 0;

    TumbolI(String name, int x, int y, int people) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.people = people;
        avialBudget = people * 5000;
    }

    int allocateBudget(int budget) {
        if (budget + currentBudget > avialBudget) {
            return 0;
        } else {
            currentBudget += budget;
            return 1;
        }
    }
}
