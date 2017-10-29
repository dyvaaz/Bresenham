/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorimabresenham;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DIF
 */
public class Garis extends JPanel {
    //Menentukan titik awal dan akhir
    private int x1,y1,x2,y2;
    
    //atur set get dari titik awal dan titik akhir
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        int x,y,xEnd;
        
        //menghitung dx dan dy
        int dx = Math.abs(x2-x1);
        int dy = Math.abs(y2-y1);
        
        //menghitung nilai p
        int p = 2*dy-dx; // p awal
        int duaDy = 2*dy; // p = 2 * dy
        int duaDyDx = 2*(dy-dx); // p = p + (2 * dy - 2 * dx)
        
        //menentukan titik awal dan akhir
        if (x1>x2) {
            x = x2;
            y = y2;
            xEnd = x1;
        } else {
            x = x1;
            y = y1;
            xEnd = x2;
        }
      
            //Gambar Titik Awal
            //tampilan ketebalan garis dan warna garis
            g.drawRect(x, y, 20, 8);
            g.setColor(Color.RED);
       
        //looping untuk menggambar titik
        while(x<xEnd) {
            x++; //karena nilai x akan selalu tambah 1 terus menerus
            if(p<0) {
                p += duaDy; //hitung p selanjutnya jika p < 0
            }
            //
            else {
                if (y1>y2) {
                    y--; //karena nilai y akan berkurang 1
                } 
                else y++;
                p += duaDyDx; //hitung p selanjutnya jika p>0 atau p = 0
            }
            
            //Gambar Setelah dilakukan Penambahan
            //tampilan ketebalan garis dan warna garis
            g.drawRect(x, y, 20, 8);
            g.setColor(Color.blue);
        }
     
   }
}

