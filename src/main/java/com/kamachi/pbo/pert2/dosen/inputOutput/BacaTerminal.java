/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert2.dosen.inputOutput;

import java.util.Scanner;

/**
 *
 * @author hengk
 */

public class BacaTerminal {

    public static void main(String[] args) {
        //ciptakan object scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine(); // untuk scan lagi
        System.out.print("Usia : ");
        int umur = sc.nextInt(); // untuk scan bilangan
        System.out.println("Nama Santri : " + nama + ", umur : " + umur + " tahun");
    }
}
