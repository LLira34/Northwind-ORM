/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gbarron
 */
public class Utilerias {
    
    
    public static boolean envioEmail() {
        return true;
    }
    
    public static void centrarVentana(JFrame ventana) {
        
        Dimension frame = ventana.getSize();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        double posx = (pantalla.getWidth() - ventana.getWidth())/2;
        double posy = (pantalla.getHeight() - ventana.getHeight())/2;
        ventana.setLocation((int)posx, (int)posy);
    }
    
    public static void setStyle(JTextField text) {
        text.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 153));
        text.setText("jTextField1");
        text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
    }
    public static void setStyle(JPasswordField text) {
        text.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 153));
        text.setText("jTextField1");
        text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
    }

}
