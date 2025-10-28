/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert5.dosen;

/**
 *
 * @author hengk
 */
public class Dosen extends Person{
//    Member1 var
    private String nidn;
    private String gelar;
    
//    Member2 constructor
    public Dosen() {
        super();
    }
    
    
    
//    Member3 method

    public String getNidn() {
        return nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
    
    @Override
    public String toString() {
        return "Dosen{"+ 
                super.toString() +
                "\n\tnidn="+ nidn +
                "\n\tgelar="+ gelar +
                "\n}";
    }
}
