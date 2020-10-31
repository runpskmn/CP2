
import java.util.Scanner;

public class W3P8_IndexOf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        int index = str.indexOf(s);
        if(index == -1){
            System.out.println("string not found");
        }else{
            System.out.println(index+1);
        }
        
    }
}
