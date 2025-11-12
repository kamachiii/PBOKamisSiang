/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.assets;

/**
 *
 * @author hengk
 */
public class Perhiasan implements Assets {
//    member1 var
    private String jenis;
    private float berat;
    
//    member2 constructor
    public Perhiasan() {
    }
    
//    member3 method

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    @Override
    public double nilaiAssets() {
        return 100000000;
    }

    @Override
    public String toString() {
        return "Perhiasan{" + "jenis=" + jenis + ", berat=" + berat + '}';
    }
    
}
