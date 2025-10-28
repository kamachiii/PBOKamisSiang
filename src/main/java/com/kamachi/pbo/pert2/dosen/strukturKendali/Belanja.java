/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert2.dosen.strukturKendali;

/**
 *
 * @author hengk
 */
public class Belanja {

    public static void main(String[] args) {
        //deklarasi dan inisialisasi variabel
        String pelanggan = "Budi Santoso";
        double totalBelanja = 150000;
        String keterangan;
        //struktur kendali if
        if (totalBelanja > 100000) {
            keterangan = "Selamat Anda mendapat Hadiah";
        } else {
            keterangan = "Terima kasih sudah berbelanja";
        }
        System.out.println(keterangan);
    }
}
