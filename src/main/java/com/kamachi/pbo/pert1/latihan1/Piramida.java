/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class Piramida {
    public static void main(String[] args) {
        for (int i = 1; i < 13; ++i) {
            for (int j = 1; j <= 13 - i; ++j) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; ++k) {
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
}
