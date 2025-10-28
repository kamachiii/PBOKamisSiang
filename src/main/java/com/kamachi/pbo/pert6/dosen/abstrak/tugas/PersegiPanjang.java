/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert6.dosen.abstrak.tugas;

/**
 *
 * @author hengk
 */
public class PersegiPanjang extends Bentuk2D {
    double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luasBidang() {
        return this.panjang * this.lebar;
    }
    
    @Override
    public double kelilingBidang() {
        return 2 * (this.panjang * this.lebar);
    }
    
    @Override
    public String toString() {
        return namaBentuk() + " panjang " + this.panjang + " dan lebar " + this.lebar;
    } 
}
