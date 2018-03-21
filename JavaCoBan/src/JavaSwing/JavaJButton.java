/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author root
 */
//https://www.javatpoint.com/java-jbutton
//https://www.tutorialspoint.com/swing/swing_jbutton.htm

class button
{
    JButton button;
    
    public JButton design1()
    {
       
        
        this.button= new JButton(); // tao button k co text va icon
        
        this.button.setText("desing1");// tao text cho button 
        
        this.button.setBounds(100, 100, 100, 100);
        
        this.button.setBackground(Color.GRAY);
        
          this.button.setBorderPainted(true);
     return this.button;   
    }
    
}

class frame
{
    JFrame frame;
    
    public JFrame design1()
    {
        this.frame= new JFrame();
        
        this.frame.setTitle("design1");
        
        this.frame.setSize(500, 500);
        
        this.frame.setLocationRelativeTo(null);
        
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.frame.setVisible(true);
        
        this.frame.setLayout(null); // quan li bo cuc
        
        return this.frame;
    }
}

public class JavaJButton {
    
   public static void main(String []args)
   {
        frame fr1= new frame();
    
        button but1= new button();
    
        fr1.design1().add(but1.design1());
       
        
        
   }
    
}
