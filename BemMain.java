/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bemmain;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class BemMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println ("PEMILIHAN SUARA KETUA BEM 2020");
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Bem pilih = new Bem();
        Bem[] arr = new Bem[pilih.Kandidat];
        
        for (int i = 0; i < pilih.Kandidat; i++) {
        arr[i] = new Bem();
        System.out.println("Nama Kandidat ke- " + (i + 1) + " : ");
        arr[i].calonKetua = input.nextLine();
        }
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < pilih.Kandidat; i++ ){
            System.out.print("Jumlah Suara Kandidat ke-" + (i + 1) + " : ");
            arr[i].suara = input.nextInt();
            pilih.totalSuara += arr[i].suara;
        }
        
        int hasil = pilih.Hitung(pilih.totalSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3]. suara);
        if (hasil == 0){
            System.out.println("kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM 2020 adalah :" +arr[hasil-1].calonKetua);
        }
    }
    
}
