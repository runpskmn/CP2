
import java.util.Scanner;

public class Tumbol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tumbol tum = new Tumbol(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i <= n; ++i) {
            int budget = sc.nextInt();
            if (tum.allocateBudget(budget) == 1) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if(!flag){
                System.out.println("none");
        }
    }
}

class Tumbol {

    String name;
    int x, y, people;
    int avialBudget;
    int currentBudget = 0;

    Tumbol(String name, int x, int y, int people) {
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
