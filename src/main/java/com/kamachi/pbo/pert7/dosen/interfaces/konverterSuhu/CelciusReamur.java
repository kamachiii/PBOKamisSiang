/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.konverterSuhu;

/**
 *
 * @author hengk
 */
public class CelciusReamur implements KonverterSatuan {
    String asal, tujuan;

    public CelciusReamur() {
        this.asal = "Celcius";
        this.tujuan = "Reamur";
    }

    @Override
    public float konversi(float input) {
        return 4f / 5 * input;
    }

    @Override
    public String satuanInput() {
        return this.asal;
    }

    @Override
    public String satuanOutput() {
        return this.tujuan;
    }
    
}
