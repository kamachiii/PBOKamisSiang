/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.alatmusik;

/**
 *
 * @author hengk
 */
public class Pianika implements MusikTiup, MusikTekan{

    @Override
    public void tiup() {
        System.out.println("Suara pianika ditiup pffttt...");
    }

    @Override
    public void tekan() {
        System.out.println("Suara pianika ditekan net.. not..");
    }
    
}
