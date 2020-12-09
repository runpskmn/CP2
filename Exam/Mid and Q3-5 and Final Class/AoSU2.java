
import java.util.Scanner;


class Hero {

    String name;
    int hp, attkType, attkDmg, phyDef, magDef;

    Hero(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef) {
        this.name = name;
        this.hp = hp;
        this.attkType = attkType;
        this.attkDmg = attkDmg;
        this.phyDef = phyDef;
        this.magDef = magDef;
        checkAndWarn();
    }

    boolean checkAndWarn() {
        if (hp < 0 || attkType < 0 || attkDmg < 0 || phyDef < 0 || magDef < 0) {
            System.out.println("warning: value cannot be negative");
            return false;
        } else {
            return true;
        }
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.print("Attack: " + attkDmg);
        if (attkType == 1) {
            System.out.println(" (physical)");
        } else {
            System.out.println(" (magical)");
        }
        System.out.println("Defense: " + phyDef + " (physical), "
                + magDef + " (magical)");
        checkAndWarn();
    }
}

class Team {

    Hero[] members;

    Team(Hero[] members) {
        if (is5MemberTeam(members) && isValid(members)) {
            this.members = members.clone();

        }
    }

    boolean is5MemberTeam(Hero[] members) {
        if (members == null || members.length < 5) {
            System.out.println("member is missing");
            return false;
        } else if (members.length > 5) {
            System.out.println("too many members");
            return false;
        } else {
            System.out.println("full team");
            return true;
        }
    }

    boolean isValid(Hero[] members) {
        if (members == null || members.length < 5 || members.length > 5) {
            return false;
        }
        for (int i = 0; i < 4; ++i) {
            String name1 = members[i].name;
            for (int j = i + 1; j < 5; ++j) {
                if (name1.equals(members[j].name)) {
                    System.out.println("cannot select same hero: " + name1);
                    return false;
                }
            }
        }
        System.out.println("valid hero selection");
        return true;
    }
}

public class AoSU2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = null;
        if (N > 0 && N <= 20) {
            members = new Hero[N];
            for (int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}
