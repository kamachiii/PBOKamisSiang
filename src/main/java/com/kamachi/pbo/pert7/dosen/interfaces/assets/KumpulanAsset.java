/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.assets;

/**
 *
 * @author hengk
 */
public class KumpulanAsset {
    public static void main(String[] args) {
//        buat obj
        Rumah rumah = new Rumah();
        Motor motor = new Motor();
        Perhiasan lm = new Perhiasan();
        
//        set data
        rumah.setTipe(70); rumah.setLuas(120);
        motor.setMerk("Honda"); motor.setCc(125); motor.setTahun(2021);
        lm.setJenis("Logam Mulia"); lm.setBerat(100);
        
//        cetak data
        Assets assetku[] = {rumah, motor, lm};
        double total_asset = 0;
        
        for(Assets a : assetku) {
            System.out.println(a);
            total_asset += a.nilaiAssets();
        }
        System.out.printf("Total assetku: %,.2f\n", total_asset);
    }
}
