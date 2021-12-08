
import java.util.Scanner;


public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int p = sc.nextInt();
        int k = sc.nextInt();
        int[] platform = new int[n]; //แทนสถานีรถไฟข้อมูลคือจำนวนที่นั่งที่ถูกจองไป เช่นมี 5 สถานีความจุเริ่มต้นแต่ละสถานีจะเป็น 0 0 0 0 0 ตามลำดับ
        for(int i=0;i<k;++i){
            int x = sc.nextInt(); //สถานีที่ขึ้น
            int y = sc.nextInt(); //สถานีที่ลง
            int z = sc.nextInt(); //จำนวนคน
            boolean canReserve = true; //เช็คว่าสามารถจองได้ไหม โดยให้เริ่มต้นเป็น true คือสามารถจองได้
            for(int j=x;j<y;++j){ //วนทุกสถานีตั้งแต่สถานีต้นทาง - ปลายทางที่ต้องการจอง 
                if(platform[j]+z > p){ //เช่นมี 5 สถานีจะวนดูสถานีแรกก่อนว่าความจุของสถานีนั้นบวกกับจำนวนคนที่จะจองเข้ามาใหม่นั้นรวมกันเกินค่า p แล้วหรือยัง
                    canReserve = false; //ถ้าเกินแล้วจะเข้าเงื่อนไขนี้ จะเปลี่ยนค่าเป็น false คือไม่สามรถจองได้
                    break; //ในเมื่อเจอสถานีระหว่างทางที่ต้องการจองที่นั่งไม่พอแล้วเท่ากับว่าการจองคั้งนี้คือจองไมไ่ด้ ก็ไม่จำเป็นต้องไปดูสถานีถัดไป ก็เลยหยุดลูป
                }
            }
            if(canReserve){ //ความสามารถของบูลลีนคือถ้าต้องการเช็คว่าเป็น true ก็พิมแค่ชื่อตัวแปรจะมีความหมายเป็น canReserve == true ถ้าต้องการตรวจสอบว่าเป้น false ก็ใช้เป็น !canReserve จะมีค่าเป็น canReserve == false
                System.out.println("Y"); //จองได้ก็พิมพ์ Y ออกมา
                for(int j=x;j<y;++j) //ในเมื่อจองได้ก็ต้องอัพเดทที่นั่งในแต่ละสถานีที่คนจองเข้ามาใหม่ผ่านด้วย
                    platform[j]+=z;
            }else
                System.out.println("N"); //อันนี้คือจองไม่ได้ก็พิมพ์ N ออกมา
        }
    }
}
