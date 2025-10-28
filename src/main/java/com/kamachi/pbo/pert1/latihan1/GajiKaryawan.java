/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert1.latihan1;

/**
 *
 * @author hengk
 */
public class GajiKaryawan {

    public static void main(String[] args) {
        int jam_kerja_perhari = 8;
        int gaji_perhari = 1200000;
        int jam_lebur = 15;
        int upah_lembur = jam_lebur / jam_kerja_perhari * gaji_perhari;
        System.out.println("Upah lembur: " + upah_lembur);
    }
}


/** 
 * PERTANYAAN:
 * 1. Apakah yang salah dengan cara perhitungan tersebut?
 * 2. Berapa selisih upah lembur antara hasil perhitungan program tersebut dengan jumlah yang seharusnya ?
 * 
 * JAWABAN:
 * 1. Ya, perhitungan upah_lembur dengan rumus yang salah. Seharusnya:
 * - upah_lembur = (gaji_perhari / jam_kerja_perhari) * ((jam_kerja_perhari * total_hari) + jam_lembur)
 * 
 * Note: total_hari berdasarkan berapa hari dia bekerja
 * 
 * 2. Tergantung, jika dia dalam sebulan dia bekerja 20 hari maka
 *    = 26.250.000 - 2.250.000
 *    = 24.000.000
*/
