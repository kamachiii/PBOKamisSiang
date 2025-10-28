/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert5.dosen;

/**
 *
 * @author hengk
 */
public class CivitasKampus {

    public static void main(String[] args) {
//        buat object
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen();

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();

//        panggil fungsi di Class Dosen & Mahasiswa
        d1.setNidn("1111");
        d1.setNama("Nasrul");
        d1.setGender('L');
        d1.setGelar("S.Kom, M.Kom");

        d2.setNidn("2222");
        d2.setNama("Tiffany");
        d2.setGender('P');
        d2.setGelar("ST, MT");

        m1.setNama("Eko");
        m1.setGender('L');
        m1.setJurusan("TI");
        m1.setSemester(3);

        m2.setNama("Maya");
        m2.setGender('P');
        m2.setJurusan("SI");
        m2.setSemester(6);

        Person ar[] = {d1, d2, m1, m2};
        for (Person a : ar) {
            System.out.println(a);
        }
    }
}
