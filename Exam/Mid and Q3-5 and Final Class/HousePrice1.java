
import java.util.Scanner;

//class House {
    int landSize,quality,floors,houseArea;
    public int price;
    House(int landSize,int quality,int floors,int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice(landSize,quality,floors,houseArea);
    }
    int computePrice(int landSize,int quality,int floors,int houseArea){
        int sum =0;
        sum+=landSize*10000;
        sum+=200000*(floors-1);
        if(quality==1){
            sum+=10000*houseArea;
        }else if(quality==2){
            sum+=8000*houseArea;
        }else if(quality==3){
             sum+=5000*houseArea;
        }
        return sum;
    }
}

public class HousePrice1 {
    // Do not change the code below this line.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();

        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " "
                + house.quality + " " + house.floors + " "
                + house.houseArea);
        System.out.println(house.price);
    }
}
