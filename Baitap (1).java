
package baitap;

import java.util.Scanner;



public class Baitap {

   
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Nhap so pha tu cua mang: ");
        int a = scanner.nextInt();
        int[] number = new int[a];
        
        for (int i = 0; i < a;i++){
            System.out.print("[" + (i+1) + "]" + "; ");
            number[i]= scanner.nextInt();
            
        }
      
                         
    }
  
}
