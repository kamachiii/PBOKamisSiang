/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert6.dosen.abstrak.tugas;

/**
 *
 * @author hengk
 */
public class SegiTiga extends Bentuk2D {
    double alas, tinggi, sisi;
    
    public SegiTiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    
    @Override
    public double luasBidang() {
        return 1/2 * this.alas * this.tinggi;
    }
    
    @Override
    public double kelilingBidang() {
        return this.alas + this.tinggi + this.sisi;
    }
}
