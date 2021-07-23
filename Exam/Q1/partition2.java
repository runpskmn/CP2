
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RunPSK
 */
public class partition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = sc.nextInt();
        
        int mid = arr[n/2]; //หาค่ากลางของอาเรย์ตัวแรก
        int count = 0; //ไว้เอาเป็น index สำหรับเก็บข้อมูลลงอาเรย์ใหม่
        for(int i=0;i<n;++i){
            if(arr[i] <= mid){
                arr2[count] = arr[i];
                count++; //บวก index ไปหนึ่ง
            }
        }
        
        mid = arr2[count/2]; //หาค่ากลางของอาเรย์ตัวใหม่
        for(int i=0;i<count;++i){
            if(arr2[i] <= mid){
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        for(int i=0;i<count;++i){
            if(arr2[i] > mid){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
