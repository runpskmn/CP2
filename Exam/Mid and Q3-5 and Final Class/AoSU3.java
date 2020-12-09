
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

class Carry extends Hero {
    Carry(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Fighter extends Hero {
    Fighter(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Mage extends Hero {
    Mage(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Tank extends Hero {
    Tank(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Support extends Hero {
    Support(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Assasin extends Hero {
    Assasin(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
            super(name,hp,attkType,attkDmg,phyDef,magDef);
    }
}

class Team {

    Hero[] members;

    Team(Hero[] members) {
        if (is5MemberTeam(members) && isValid(members)) {
            this.members = members.clone();
            isBalanced(members);
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

    boolean isBalanced(Hero[] members) {
        if(members == null || members.length<5||members.length>5){
            return false;
        }
        
        boolean[] type = new boolean[7];
        for(int i=0;i<members.length;++i){
            if(members[i] instanceof Carry){
                type[1] = true;
            }else if(members[i] instanceof Fighter){
                type[2] = true;
            }else if(members[i] instanceof Mage){
                type[3] = true;
            }else if(members[i] instanceof Tank){
                type[4] = true;
            }else if(members[i] instanceof Support){
                type[5] = true;
            }else if(members[i] instanceof Assasin){
                type[6] = true;
            }
        }
        if(type[1] && type[2] && type[3] && type[4]){
            System.out.println("balanced team");
            return true;
        }else{
            System.out.print("team needs ");
            for(int i=1;i<=4;++i){
                if(type[i]==false){
                    if(i==1)
                        System.out.print("carry ");
                    else if (i==2)
                        System.out.print("fighter ");
                    else if(i==3)
                        System.out.print("mage ");
                    else if(i==4)
                        System.out.print("tank ");
                }
            }
            System.out.println();
            return false;
        }
    }
}

public class AoSU3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = null;
        if (N > 0) {
            members = new Hero[N];
            for (int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                if (type == 1) {
                    members[i] = new Carry(name, hp, attkType,attkDmg, phyDef, magDef);
                }else if(type==2){
                    members[i] = new Fighter(name, hp, attkType,attkDmg, phyDef, magDef);
                }else if(type==3){
                    members[i] = new Mage(name, hp, attkType,attkDmg, phyDef, magDef);
                }else if(type==4){
                    members[i] = new Tank(name, hp, attkType,attkDmg, phyDef, magDef);
                }else if(type==5){
                    members[i] = new Support(name, hp, attkType,attkDmg, phyDef, magDef);
                }else if(type==6){
                    members[i] = new Assasin(name, hp, attkType,attkDmg, phyDef, magDef);
                }
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
    }
}
