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
    double alas, tinggi, sisiMiring;
    
    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
    
    @Override
    public double luasBidang() {
        return 0.5f * this.alas * this.tinggi;
    }
    
    @Override
    public double kelilingBidang() {
        return this.alas + this.tinggi + this.sisiMiring; //Segitiga Siku siku
    }
    
    @Override
    public String toString() {
        return namaBentuk() + " alas " + this.alas + ", tinggi " + this.tinggi + ", dan sisi miringnya " + this.sisiMiring;
    } 
}
