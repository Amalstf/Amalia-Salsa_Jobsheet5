/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bemmain;

/**
 *
 * @author Hp
 */
public class Bem {


    public int suara, totalSuara = 0, Kandidat = 4;
    public String calonKetua;
    public static int control = 0, nilai = 1, accept = 0, accept2 = 0;
    public static int array[] = new int [10000];
    
   
    public static int Hitung(int ts, int kl, int k2, int k3, int k4){
        if (nilai == 5){
            nilai = 1;
        }
        
        if (nilai == 1 && kl > 0){
            array[control] = nilai;
            control++;
            nilai++;
            return Hitung(ts, kl -1, k2, k3, k4);
        } else if (nilai == 2 && k2 > 0){
            array[control] = nilai;
            control++;
            nilai++;
            return Hitung(ts, kl, k2 -1, k3, k4);
       } else if (nilai == 3 && k3 > 0){
           array[control] = nilai;
           control++;
           nilai++;
           return Hitung(ts, kl, k2, k3  -1, k4);
       } else if (nilai == 4 && k4 > 0) {
           array[control] = nilai;
           control++;
           nilai++;
           return Hitung(ts, kl, k2, k3, k4 -1);
       } else if (kl == 0 && k2 == 0 && k3 == 0 && k4 == 0) {
           if (array[accept] == array[accept + 1] && accept + 1 < ts){
           return array[accept];
       } else if (accept+2 < ts){
           accept += 2;
           return Hitung(ts, kl, k2, k3, k4);
       } else {
           return 0;
       } }
        else {
               nilai++;
               return Hitung(ts, kl, k2, k3, k4);
               }
         
    }
    }  

