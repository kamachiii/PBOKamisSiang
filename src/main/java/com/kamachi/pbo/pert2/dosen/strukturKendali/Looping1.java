/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert2.dosen.strukturKendali;

/**
 *
 * @author hengk
 */
public class Looping1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // increment i = i + 1
            if (i == 3) {
                continue;
            }
            System.out.println("Bilangan " + i);
            if (i == 7) {
                break;
            }
        }
    }
}
