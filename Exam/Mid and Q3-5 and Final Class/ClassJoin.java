
import java.util.Scanner;

class Component{
    
    String model;
    int socket,memType;
    boolean valid;
    
    Component(String model,int socket,int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
    }
    
    boolean isValidSpec(String model, int socket, int memType) {
        if (model != null && model.length() != 0 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }
    
    void printInfo(){
        System.out.println(valid); 
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
    }
    
}

class MainBoard2 extends Component{
    
    MainBoard2(String model,int socket,int memType){
        super(model,socket,memType);
        super.valid = super.isValidSpec(model, socket, memType);
    }
}

class CPU2 extends Component{
    
    int clocks;
    
    CPU2(String model, int clocks, int socket, int memType){
        super(model,socket,memType);
        this.clocks = clocks;
        super.valid = isValidSpec(model,clocks,socket,memType);
    }
    
    @Override
    void printInfo(){
        super.printInfo();
        System.out.println(clocks);
    }
    
    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        boolean s = super.isValidSpec(model, socket, memType);
        if(s && clocks > 0){
            return true;
        }else{
            return false;
        }
    }
}
public class ClassJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU2 cpu = new CPU2(model, clocks, socket, memType);
        cpu.printInfo();
        
        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        Component mb = new MainBoard2(model, socket, memType);
        mb.printInfo();
    }
}
