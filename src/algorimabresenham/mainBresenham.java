/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorimabresenham;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

/**
 *
 * @author DIF
 */
//Pemanggilan fungsi pembuatan garis dengan Algoritma Brsenham
public class mainBresenham {
     
    public static void main(String[] args) {
        JFrame frame = new JFrame("Algoritma Bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Memanggil fungsi garis yasssng ada di class Garis
        Garis hasil = new Garis();
        
        //menampilkan hasil dari garis dan mengatur titik
        hasil.setx1(10);
        hasil.sety1(20);
        hasil.setx2(60);
        hasil.sety2(50);
        
        //Menampilkan Frame
        frame.add(hasil);
        frame.setBackground(Color.MAGENTA);
        frame.setSize(600,300);
        frame.setVisible(true);
        
    }
}
