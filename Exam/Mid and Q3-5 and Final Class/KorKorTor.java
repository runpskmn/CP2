
import java.util.Scanner;

class Party {

    String partyName;
    int partyMember;
    String[] Name, lastName;
    int[] regionNumber;

    Party(String partyName, int partyMember, Scanner scan) {
        this.partyName = partyName;
        this.partyMember = partyMember;
        Name = new String[partyMember+1];
        lastName = new String[partyMember+1];
        regionNumber = new int[partyMember+1];
        for (int i = 1; i <= partyMember; ++i) {
            Name[i] = scan.next();
            lastName[i] = scan.next();
            regionNumber[i] = scan.nextInt();
        }
    }
    
    void printInfo(int r){
        if(r==0){
            for(int i=1;i<=partyMember;++i){
                System.out.println(Name[i]+" "+lastName[i]+" "+regionNumber[i]);
            }
        }else if(r>0){
            boolean flag = false;
            for(int i=1;i<=partyMember;++i){
                if(r==regionNumber[i]){
                    System.out.println(Name[i]+" "+lastName[i]);
                    flag = true;
                }
            }
            if(!flag)
                System.out.println("none");
        }else{
            System.out.println("invalid region number");
        }
    }

}

public class KorKorTor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Party[] party = new Party[n + 1];
        String[] partyName = new String[n + 1];
        int[] partyMember = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            partyName[i] = scan.next();
            partyMember[i] = scan.nextInt();
        }
        for (int i = 1; i <= n; ++i) {
            party[i] = new Party(partyName[i], partyMember[i], scan);
        }
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }

}
