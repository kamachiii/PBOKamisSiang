/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert4.asdos.oop;

/**
 *
 * @author hengk
 */
public class Gempa {
//    Member1 Var
    private String tempat;
    private float skala;
    
//    Member2 Constructor
    public Gempa(String tempat, float skala) {
        this.tempat = tempat;
        this.skala = skala;
    }
    
//    Member3 method
    public String Dampak() {
        String efek = "";
        
        if (this.skala < 3f) {
            efek = "Tidak Terasa";
        }
        else if (this.skala >= 3f && this.skala <= 5f) {
            efek = "Bangunan Retak2";
        }
        else if (this.skala > 5f && this.skala<= 8f) {
            efek = "Bangunan Roboh";
        }
        else {
            efek = "Tsunami";
        }
        
        System.out.println("Telah terjadi gempa di "+ this.tempat +
                " dengan skala "+ this.skala +" richer "+
                " berdampak "+ efek);
        
        return efek;
    }
}
