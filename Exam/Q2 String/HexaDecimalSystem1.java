
import java.util.Scanner;


public class HexaDecimalSystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int target = sc.nextInt();
        int lenght = str.length();
        if(str.charAt(lenght-target-1)=='A')
            System.out.print("10");
        else if(str.charAt(lenght-target-1)=='B')
            System.out.print("11");
        else if(str.charAt(lenght-target-1)=='C')
            System.out.print("12");
        else if(str.charAt(lenght-target-1)=='D')
            System.out.print("13");
        else if(str.charAt(lenght-target-1)=='E')
            System.out.print("14");
        else if(str.charAt(lenght-target-1)=='F')
            System.out.print("15");
        else
            System.out.print(str.charAt(lenght-target-1));
        System.out.println("X16^"+target);
    }
}
