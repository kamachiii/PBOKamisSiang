/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert3.dosen.array;

/**
 *
 * @author hengk
 */
public class HimpunanNilai {

    public static void main(String[] args) {
        int[] nilai = {80, 85, 90, 75, 88};
        System.out.println("Jumlah elemen: " + nilai.length);
        
        // Menampilkan semua elemen dengan for
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
        
        // Hitung rata-rata
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata: " + rata);
    }
}
