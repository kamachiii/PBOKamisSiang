/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert4.dosen.oop;

/**
 *
 * @author hengk
 */
public class Transaksi {
    public static void main(String[] args) {
//        Buat obj
        Bank n1 =  new Bank("Budi", 111, 5000000);
        Bank n2 =  new Bank("Dedi", 222, 7000000);
        Bank n3 =  new Bank("Siti", 333, 9000000);
        
//        Panggil method
        n1.mencetak();
        n2.mencetak();
        n3.mencetak();
        
        n1.menabung(2000000);
        n2.menarik(2000000);
        n3.menabung(1000000);
        
        n1.mencetak();
        n2.mencetak();
        n3.mencetak();
    }
}
