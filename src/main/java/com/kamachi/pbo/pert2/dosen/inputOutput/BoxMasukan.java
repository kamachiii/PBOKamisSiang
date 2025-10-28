/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamachi.pbo.pert2.dosen.inputOutput;

import javax.swing.JOptionPane;

/**
 *
 * @author hengk
 */
public class BoxMasukan {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Nama Anda?");
        JOptionPane.showMessageDialog(null, "Apa Kabar " + nama + "?");
    }
}
