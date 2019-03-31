package utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gbarron
 */
public class UtileriasStyle {

    public static void centrarVentana(JFrame ventana) {

        Dimension frame = ventana.getSize();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        double posx = (pantalla.getWidth() - ventana.getWidth()) / 2;
        double posy = (pantalla.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation((int) posx, (int) posy);
    }

    public static void setStyle(JTextField text) {
        text.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 153));
        text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));

        text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
                text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 1), 1, true));
            }

        });
        text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e); //To change body of generated methods, choose Tools | Templates.
                text.setSelectionStart(0);
                text.setSelectionEnd(text.getText().length());
            }

        });
    }

    public static void setStyle(JPasswordField text) {
        text.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 153));
        text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));

        text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e); //To change body of generated methods, choose Tools | Templates.
                text.setSelectionStart(0);
                text.setSelectionEnd(text.getText().length());
            }

        });
    }

    public static void setStyle(JLabel text) {
        
        text.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setBackground(new java.awt.Color(255, 153, 0));
        text.setOpaque(true);


    }

    public static void setStyle(JButton boton) {
        boton.setBackground(new java.awt.Color(204, 102, 0));
        boton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setOpaque(false);
        boton.setPreferredSize(new java.awt.Dimension(80, 30));

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseMoved(e); //To change body of generated methods, choose Tools | Templates.
                boton.setForeground(new java.awt.Color(255, 255, 1));
                boton.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
                boton.setForeground(new java.awt.Color(255, 255, 255));
                boton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

            }

        });
    }

    public static void initStyle(Component[] componentes) {
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                setStyle((JTextField) c);
            }
            if (c instanceof JPasswordField) {
                setStyle((JPasswordField) c);
            }
            if (c instanceof JLabel) {
                setStyle((JLabel) c);
            }
            if (c instanceof JButton) {
                setStyle((JButton) c);
            }
        }
    }

}
