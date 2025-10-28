/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert4.asdos.oop;

/**
 *
 * @author hengk
 */
public class InfoGempa {
    public static void main(String[] args) {
//        Membuat object dari Class Gempa
        Gempa g1 = new Gempa("Jepang", 7.8f);
        Gempa g2 = new Gempa("Philipina", 5.7f);
        Gempa g3 = new Gempa("Argentina", 3.6f);
        Gempa g4 = new Gempa("India", 2.0f);
        
//        Cara mencetak 1
        System.out.println("===== Cara mencetak 1 =====");
        
        g1.Dampak();
        g2.Dampak();
        g3.Dampak();
        g4.Dampak();
        
        System.out.println("====================");
        
//        Cara mencetak 2
        System.out.println("===== Cara mencetak 2 =====");
        
        Gempa ar_gempa[] ={g1, g2, g3, g4};
        for (Gempa gempa : ar_gempa) {
            gempa.Dampak();
        }
        
        System.out.println("===============");
    }
}
