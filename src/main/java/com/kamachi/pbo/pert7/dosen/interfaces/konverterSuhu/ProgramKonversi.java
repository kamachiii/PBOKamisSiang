/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.konverterSuhu;

import java.util.Scanner;

/**
 *
 * @author hengk
 */
public class ProgramKonversi {

    public static void main(String[] args) {
        int jumlahKonverter = 4, n = 0, pilih, suhuAwal;
        KonverterSatuan konverters[] = new KonverterSatuan[jumlahKonverter];
        konverters[n++] = new CelciusFahrenheit();
        konverters[n++] = new FahrenheitCelcius();
        konverters[n++] = new CelciusReamur();
        konverters[n++] = new ReamurCelcius();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih konverter: (ketik 0 untuk exit)");

            for (int i = 1; i <= konverters.length; i++) {
                System.out.println(i + ")" + konverters[i - 1].satuanInput() + 
                        " ke " + konverters[i - 1].satuanOutput() + "...");
            }
            System.out.print("\nPilihan: ");
            pilih = sc.nextInt();

            if (pilih == 0) {
                System.out.println("Selesai...");
                break;
            } else if (pilih > konverters.length) {
                System.out.println("Tidak boleh lebih dari " + konverters.length);
            } else {
                System.out.print("Masukkan suhu " + konverters[pilih - 1].satuanInput() + ": ");
                suhuAwal = sc.nextInt();
                konverters[pilih - 1].konversi(suhuAwal);
                System.out.println("\nTitik didih air " + suhuAwal + " " + 
                    konverters[pilih - 1].satuanInput() + " setara dengan " + konverters[pilih - 1].konversi(suhuAwal) +
                    " " + konverters[pilih - 1].satuanOutput());
            }
            System.out.println("\n------------ Terimakasih ------------\n");
        }
    }
}
