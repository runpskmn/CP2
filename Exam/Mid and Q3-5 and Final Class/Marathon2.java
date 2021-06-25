
import java.util.Scanner;

class Runner{
    String name,BIB;
    static int num=1;
    
    Runner(String name,int type){
        this.name = name;
        if(type==1){
            BIB = String.format("A%03d",num);
            num++;
        }else if(type==2){
            BIB = String.format("B%03d",num);
            num++;
        }else if(type==3){
            BIB = String.format("C%03d",num);
            num++;
        }else if(type==4){
            BIB = String.format("D%03d",num);
            num++;
        }
    }
    
    void printInfo(){
        if(BIB == null){
            System.out.println("INVALID");
        }else{
            System.out.println(BIB+" "+name);
        }
    }
}

public class Marathon2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Runner[] run = new Runner[n];
        for(int i=0;i<n;++i){
            String name = scan.next();
            int type = scan.nextInt();
            run[i] = new Runner(name,type);
        }
        int countA =0,countB=0,countC=0,countD=0;
        String[] A = new String[n];
        String[] B = new String[n];
        String[] C = new String[n];
        String[] D = new String[n];
        for(int i=0;i<n;++i){
            if(run[i].BIB != null){
                if(run[i].BIB.charAt(0)=='A'){
                    A[countA] = run[i].BIB;
                    countA++;
                }else if(run[i].BIB.charAt(0)=='B'){
                    B[countB] = run[i].BIB;
                    countB++;
                }else if(run[i].BIB.charAt(0)=='C'){
                    C[countC] = run[i].BIB;
                    countC++;
                }else if(run[i].BIB.charAt(0)=='D'){
                    D[countD] = run[i].BIB;
                    countD++;
                }
            }
        }
        System.out.println(countA);
        if(countA==0)
            System.out.print("-");
        else{
            for(int i=0;i<countA;++i)
                System.out.print(A[i]+" ");
        }
        System.out.println("\n"+countB);
        if(countB==0)
            System.out.print("-");
        else{
            for(int i=0;i<countB;++i)
                System.out.print(B[i]+" ");
        }
        System.out.println("\n"+countC);
        if(countC==0)
            System.out.print("-");
        else{
            for(int i=0;i<countC;++i)
                System.out.print(C[i]+" ");
        }
        System.out.println("\n"+countD);
        if(countD==0)
            System.out.print("-");
        else{
            for(int i=0;i<countD;++i)
                System.out.print(D[i]+" ");
        }
    }
}
