/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.assets;

/**
 *
 * @author hengk
 */
public class Motor implements Assets {
//    member1 var
    private String merk;
    private int cc, tahun;
    
//    member2 constructor
    public Motor() {
        
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTahun() {
        return tahun;
    }

//    member3 method
    public void setTahun(int tahun) {    
        this.tahun = tahun;
    }

    @Override
    public double nilaiAssets() {
        return 25000000;
    }

    @Override
    public String toString() {
        return "Motor{" + "merk=" + merk + ", cc=" + cc + ", tahun=" + tahun + '}';
    }
    
    
    
}
