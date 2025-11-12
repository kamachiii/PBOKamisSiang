/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert7.dosen.interfaces.konverterSuhu;

/**
 *
 * @author hengk
 */
public class CelciusFahrenheit implements KonverterSatuan {
    String asal, tujuan;

    public CelciusFahrenheit() {
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
    }

    @Override
    public float konversi(float input) {
        return (9f / 5 * input) + 32;
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
