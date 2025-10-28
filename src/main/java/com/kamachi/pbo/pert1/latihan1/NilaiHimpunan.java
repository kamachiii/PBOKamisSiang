/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class NilaiHimpunan {

    public static void main(String[] args) {
        int[] nilai_numerik = {88, 26, 67, 92, 55, 49};
        char grade_nilai = 'Z';
        for (int i = 0; i < nilai_numerik.length; i++) {
            if (nilai_numerik[i] < 101 && nilai_numerik[i] > 0) {
                if (nilai_numerik[i] < 40) {
                    grade_nilai = 'E';
                } else if (nilai_numerik[i] < 56) {
                    grade_nilai = 'D';
                } else if (nilai_numerik[i] < 80) {
                    grade_nilai = 'C';
                } else if (nilai_numerik[i] < 90) {
                    grade_nilai = 'B';
                } else {
                    grade_nilai = 'A';
                }

                System.out.println("Nilai " + nilai_numerik[i] + " mendapatkan grade " + grade_nilai);
            } else {
                System.out.println("Nilai " + nilai_numerik[i] + " tidak valid");
            }

            System.out.println("\n====================\n");
        }
    }
}
