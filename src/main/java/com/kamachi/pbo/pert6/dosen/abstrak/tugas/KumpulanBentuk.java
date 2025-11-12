/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert6.dosen.abstrak.tugas;

/**
 *
 * @author hengk
 */
public class KumpulanBentuk {
    public static void main(String[] args) {
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new Lingkaran(5);
        Bentuk2D b3 = new PersegiPanjang(5, 6);
        Bentuk2D b4 = new BujurSangkar(5);
        Bentuk2D b5 = new SegiTiga(5, 6);
        
        Bentuk2D ar_bentuk[] = {b1, b2, b3, b4, b5};
        
        for(Bentuk2D b2d : ar_bentuk) {
            System.out.println(b2d + " luasnya " + b2d.luasBidang() + " kelilingnya " + b2d.kelilingBidang());
        }
    }
}
