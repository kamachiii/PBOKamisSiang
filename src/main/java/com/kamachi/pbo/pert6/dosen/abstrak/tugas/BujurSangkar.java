/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert6.dosen.abstrak.tugas;

/**
 *
 * @author hengk
 */
public class BujurSangkar extends Bentuk2D {
    double sisi;
    
    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luasBidang() {
        return this.sisi * this.sisi;
    }
    
    @Override
    public double kelilingBidang() {
        return 4 * this.sisi;
    }
    
    @Override
    public String toString() {
        return namaBentuk() + " sisinya " + this.sisi;
    }
}
