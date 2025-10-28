/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class HitungRataRata {
    public static void main(String[] args) {
        int[] bilangan = {1,2,3,5,6,7,9,10,23};
        float rata2 = 0f;
        
        for (int i = 0; i < bilangan.length; i++) {
            rata2 += bilangan[i];
        }
        rata2 /= bilangan.length;
        System.out.println("rata-rata\t: " + rata2);
    }
}
