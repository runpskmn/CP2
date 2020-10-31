import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age = 0;
    boolean isVaccined = false;
    Animal(String name,int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        System.out.println(name +" was born with life expectancy "+lifeExpect+" year(s)");
    }

    public void live(int years){
        int alive = lifeExpect - (age+years);
        if(age >= lifeExpect){
            System.out.println(name + " died earlier");
        }else if(alive>0){
            if(years>1)
                System.out.println(name+" lived "+years+" more years");
            else
                System.out.println(name+" lived "+years+" more year");
            age+=years;
        }else{
            if(years>1)
                System.out.println(name+" lived "+(lifeExpect - age)+" more years and died");
            else
                System.out.println(name+" lived "+(lifeExpect - age)+" more year and died");
            age+=years;
        }
    }

    public boolean isAlive(){
        if(age >= lifeExpect)
            System.out.println(name +" is dead");
        else
            System.out.println(name + " is alive");
        return (age >= lifeExpect);
    }

    public void vaccine(){
        System.out.println(name + "'s life expertaancy is now " + lifeExpect + " year(s)");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name, 8);
    }

    @Override
    public void vaccine(){
        if(!super.isVaccined){
            super.lifeExpect += lifeExpect-age;
            super.isVaccined = true;
            super.vaccine();
        }
    }
}

class Turtle extends Animal{
    Turtle(String name){
        super(name, 50);
    }
}

class Salmon extends Animal{
    Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDoamin2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        ArrayList<Animal> ani = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                int t = scan.nextInt();
                String name = scan.next();
                if(t == 1)
                    ani.add(new Dog(name));
                else if(t == 2)
                    ani.add(new Turtle(name));
                else
                    ani.add(new Salmon(name));
            } else if (type == 2) {
                int id = scan.nextInt();
                int year = scan.nextInt();
                ani.get(id-1).live(year);
            } else if (type == 3) {
                int id = scan.nextInt();
                ani.get(id-1).isAlive();
            } else if (type == 4){
                int id = scan.nextInt();
                ani.get(id-1).vaccine();
            }
        }
    }
}