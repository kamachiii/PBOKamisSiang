/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert6.dosen.abstrak;

/**
 *
 * @author hengk
 */
public class SuaraHewan {
    public static void main(String[] args) {
        Hewan tom = new Kucing();
        Hewan milo =  new Anjing();
        Hewan shaun = new Kambing();
        
        Hewan suara[] = {tom, milo, shaun};
        for (Hewan s : suara) {
            s.bersuara();
        }
    }
}
