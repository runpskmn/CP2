
import java.util.Scanner;

class CPU {

    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;

    CPU(String model, int clocks, int socket, int memType) {
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        valid = isValidSpec(model, clocks, socket, memType);
    }

    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        if (model != null && model.length() != 0 && clocks > 0 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(model + "\n" + clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

public class MBCompat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);

        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        MainBoard mb = new MainBoard(model, socket, memType);

        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}

class MainBoard {

    public String model;
    public int socket, memType;
    public boolean valid = true;

    boolean isValidSpec(String model, int socket, int memType) {
        if (model != null && model.length() != 0 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }

    MainBoard(String model, int socket, int memType) {
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        valid = isValidSpec(model, socket, memType);
    }

    void printfInfo() {
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

class Computer {

    public CPU cpu;
    public MainBoard mb;
    public boolean valid;

    Computer(CPU cpu, MainBoard mb) {
        this.cpu = cpu;
        this.mb = mb;
        valid = isValidCom(cpu, mb);
    }

    boolean isValidCom(CPU cpu, MainBoard mb) {
        if (cpu.valid && mb.valid && cpu.socket == mb.socket && cpu.memType == mb.memType) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        if (valid) {
            System.out.println(cpu.model);
            System.out.println(cpu.clocks);
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(mb.memType);
        } else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printfInfo();
        }

    }
}
