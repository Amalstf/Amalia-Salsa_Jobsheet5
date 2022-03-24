/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainfaktorial;

import java.util.Scanner;

public class MainFaktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("==========================");
        System.out.print ("Masukkan Jumlah Elemen Yang Dihitung : ");
        int elemen=sc.nextInt();
        
        
    Faktorial [] fk = new Faktorial[elemen];
    
    for(int i=0; i<elemen; i++){
        fk[i] = new Faktorial();
        System.out.print ("Masukkan nilai data ke- " +(i+1)+ ":");
        fk[i].nilai=sc.nextInt();
    }
//    long start = System.currentTimeMillis();
//   System.out.println("===========================");
//    System.out.println("Hasil Faktorial dengan BruteForce : ");
//    for(int j= 0; j<elemen; j++){
//        System.out.println("Faktorial dari nilai " + fk[j].nilai + "adalah : " + fk[j].FaktorialBF(fk[j].nilai));
//    }
//    long end = System.currentTimeMillis();
//    long elapsedtime = end - start;
//    System.out.println("Waktu" + String.valueOf(elapsedtime));
//    long start1 = System.currentTimeMillis();
//    System.out.println("================================");
//    System.out.println("Hasil Faktorial dengan Divide dan Conquer");
//    for (int k = 0; k < elemen; k++){
//        System.out.println("Faktorial dari nilai" + fk[k].nilai+ "adalah :" +fk[k].FaktorialDC(fk[k].nilai));
//    }
//    
//    long end1 = System.currentTimeMillis();
//    long elapsedtime1 = end1 -start1;
//    System.out.println("Waktu " + String.valueOf(elapsedtime1));
//    System.out.println("================================");
//    System.out.println("==========================");
        
        System.out.println("================================");
        System.out.println("Hasil Faktorial dengan BruteForce : ");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah" +fk[i].FaktorialBF(fk[i].nilai));
        }
    
        
        System.out.println("================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer : ");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah" +fk[i].FaktorialDC(fk[i].nilai));
        }
        System.out.println("==========================");
    }
    
}
