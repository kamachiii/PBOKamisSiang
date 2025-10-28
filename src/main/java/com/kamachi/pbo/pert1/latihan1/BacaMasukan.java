/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

import java.util.Scanner;

/**
 *
 * @author hengk
 */
public class BacaMasukan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama anda ? ");
        String nama = sc.nextLine(); // baca masukan
        System.out.println("Pa kabar " + nama + " ?");
    }
}
