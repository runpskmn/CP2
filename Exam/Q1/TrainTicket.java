
import java.util.Scanner;


public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int[] platform = new int[n]; //แทนสถานีรถไฟข้อมูลคือจำนวนที่นั่งที่ถูกจองไป
        for(int i=0;i<k;++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            boolean canReserve = true; //เช็คว่าสามารถจองได้ไหม
            for(int j=x;j<y;++j){ //วนทุกสถานีตั้งแต่สถานีต้นทาง - ปลายทางที่ต้องการจอง
                if(platform[j]+z > p){ //หมายความว่าที่นั่งในสถานีบางสถานีที่เราจะจองมีที่นั่งไม่พอเลยจองไม่ได้
                    canReserve = false;
                    break;
                }
            }
            if(canReserve){
                System.out.println("Y");
                for(int j=x;j<y;++j)
                    platform[j]+=z;
            }else
                System.out.println("N");
        }
    }
}
