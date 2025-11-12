/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.alatmusik;

/**
 *
 * @author hengk
 */
public class SuaraMusik {
    public static void main(String[] args) {
        Gitar m1 = new Gitar();
        Seruling m2 = new Seruling();
        Piano m3 = new Piano();
        Pianika m4 = new Pianika();
        
        m1.petik();
        m2.tiup();
        m3.tekan();
        m4.tiup();
        m4.tekan(); 
    }
}
