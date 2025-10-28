/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class Operasi1 {
    public static void main(String[] args) {
        float rad1 = 14.0f;
        float luas1, luas2;
        luas1 = 22f/7 * rad1 * rad1;
        luas2 = rad1 * rad1 * 22/7;
        
        System.out.println("luas1 : " + luas1);
        System.out.println("luas2 : " + luas2);
        
        boolean kecilDari = luas1 < luas2;
        
        System.out.println("luas 1 lebih kecil dari luas 2: " + kecilDari);
    }
}
