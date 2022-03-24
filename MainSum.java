/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainsum;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Program Menghitung Keuntungan Total ( Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah bulan : ");
                int elm = sc.nextInt();
                
        Sum sm = new Sum(elm);
        System.out.println("==================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[1] = sc.nextDouble();
        } 
         System.out.println("=============================================");
         System.out.println("Algoritma Brute Force");
         System.out.println("Total Keuntungan perusahaan selama" +sm.elemen+ "bulan adalah = " +sm.totalBF(sm.keuntungan));
         System.out.println("Algoritma DIvide Conquer");
         System.out.println("Total keuntungan perusahan selama" +sm.elemen+ "bulan adalah = " +sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        
    }
    
}
