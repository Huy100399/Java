/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwingBasic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
//https://www.javatpoint.com/java-jbutton



public class JButtonClass extends JFrame {
    
    public void creatframe()
    {
        setSize(500, 500);
        add(this.button1());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        
    }
    
    public JButton button1()
    {
        JButton button = new JButton();
        button.setText("button 1");
        button.setActionCommand("ok");
        button.setMnemonic(KeyEvent.VK_O); // tao phim tat , alt+o tuong dg voi bam chuot
        button.setToolTipText("press to...."); // tao chu thic cho button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("ok".equals(ae.getActionCommand()))
                {
                    JOptionPane.showMessageDialog(rootPane, "you have just click !");
                }
                
                
            }
        });
        
        return button;
    }
    
    public JButton button2()
    {
        JButton button = new JButton();
        
        
                
        return button;       
    }
    
    
    public static void main(String[]args)
    {
        JButtonClass but = new JButtonClass();
        but.creatframe();
    }

   
    
}
