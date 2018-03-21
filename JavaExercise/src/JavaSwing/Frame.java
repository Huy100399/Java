/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

/**
 *
 * @author root
 */



public class Frame extends WindowAdapter implements ActionListener{

    private int maxX = 500;
    private int maxY = 500;
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Frame()
    {
        Dimension screensize  = Toolkit.getDefaultToolkit().getScreenSize();
        maxX=screensize.width;
        maxY=screensize.height;    
    }
    
    public static void main(String []args)
    {
        JFrame fr = new JFrame();
        fr.setVisible(true);
    }
            
}
