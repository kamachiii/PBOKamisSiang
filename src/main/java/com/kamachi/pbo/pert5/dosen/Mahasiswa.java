/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert5.dosen;

/**
 *
 * @author hengk
 */
public class Mahasiswa extends Person{
//    Member1 var
    private String jurusan;
    private int semester;
    
//    Member2 constructor
    public Mahasiswa() {
        super();
    }
    
//    Member3 method

    public String getJurusan() {
        return jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa{" +
                super.toString() +
                "\n\tjurusan="+ jurusan +
                "\n\tsemester="+ semester +
                "\n}";
    }
}
