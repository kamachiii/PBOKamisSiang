/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert2.dosen.strukturKendali;

/**
 *
 * @author hengk
 */
public class Grade {

    public static void main(String[] args) {
        float nilai = (float) 99.70;
        char grade;
        if (nilai >= 85 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 75 && nilai < 85) {
            grade = 'B';
        } else if (nilai >= 60 && nilai < 75) {
            grade = 'C';
        } else if (nilai >= 30 && nilai < 60) {
            grade = 'D';
        } else {
            grade = 'A';
        }
        System.out.println("Nilai " + nilai + " gradenya " + grade);
    }
}
