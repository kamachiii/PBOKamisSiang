/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert4.dosen.oop;

/**
 *
 * @author hengk
 */
public class Bank {
//    Member1 Attr/var
    public String nama;
    protected int norek;
    private double saldo;

//    Member2 Constructor
    public Bank(String nama, int norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }
    
//    Member3 Method
    public void menabung(double uang) {
        this.saldo += uang;
    }
    
    public void menarik(double uang) {
        this.saldo -= uang;
    }
    
    public void mencetak(){
        System.out.printf("Nama\t: %s\nNorek\t: %d\nSaldo\t: Rp. %,.2f\n", this.nama, this.norek, this.saldo);
        System.out.println("=============================\n");
    }
}
