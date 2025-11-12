/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.assets;

/**
 *
 * @author hengk
 */
public class Rumah implements Assets {
//    Member1 var
    private int tipe, luas;
//    Member2 constructor
    public Rumah() {
        
    }
//    Member3 method

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }
   
    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
    @Override
    public double nilaiAssets() {
        return 500000000;
    }
    @Override
    public String toString() {
        return "Rumah{" + "tipe=" + tipe + ", luas=" + luas + '}';
    }
}
