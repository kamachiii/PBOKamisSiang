/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class BelajarIf {

    public static void main(String[] args) {
        float luas1 = 1 / 2f * 4.7f * 3.8f;
        float luas2 = 1 / 2f * 4.7f * 3.8f;

        if (luas1 > luas2) {
            System.out.println("segitiga 1 lebih besar");
        } else if (luas1 < luas2) {
            System.out.println("segitiga 1 lebih kecil");
        } else {
            System.out.println("kedua segitiga sama luas");
        }
    }
}
