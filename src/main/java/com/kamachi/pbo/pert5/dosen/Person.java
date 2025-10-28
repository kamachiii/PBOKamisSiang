/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert5.dosen;

/**
 *
 * @author hengk
 */
public class Person {
//    Member1 var
    private String nama;
    private char gender;
    
//    Member2 blank constructor
    public Person() {
        
    }
    
//    Member3 method getter && setter
    public String getNama() {
        return nama;
    }

    public char getGender() {
        return gender;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return "\n\tPerson{"+
                "\n\t\tnama="+ nama +
                "\n\t\tgender"+ gender +
                "\n\t}";
    }
}
