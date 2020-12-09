
import java.util.Scanner;

class Student {

    int id;
    String name, surname;

    Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    void printInfo() {
        System.out.print(name + " " + surname+" ");
    }
}

class Course {

    String name;
    int n;
    int[] id;
    int currentSeat = 0;

    Course(String name, int n) {
        this.name = name;
        this.n = n;
        id = new int[n];
    }

    boolean enroll(int id, Student[] std) {
        boolean found = false;
        int p =0;
        for (int i = 0; i < std.length; ++i) {
            if (id == std[i].id) {
                found = true;
                p= i;
                break;
            }
        }
        if (!found) {
            System.out.print("Invalid ID ");
        } else {
            for (int i = 0; i < n; ++i) {
                if (id == this.id[i] || currentSeat >= n) {
                    found = false;
                    break;
                }
            }
            if (found) {
                this.id[currentSeat] = id;
                currentSeat++;
                std[p].printInfo();
            }
        }
        return found;
    }

    void printInfo() {
        System.out.println(name + " " + currentSeat);
        for (int i = 0; i < currentSeat; ++i) {
            System.out.println(id[i]);
        }
    }
}

public class Enrollment2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i] = new Student(id,firstName,lastName);
        }
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id, s);
            System.out.println(result);
        }

        co.printInfo();
    }
}
