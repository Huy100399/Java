/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author root
 */

// Jlabel : https://docs.oracle.com/javase/tutorial/uiswing/components/label.html


public class Jlabel_JtextField_Jbutton extends JFrame{

    public Jlabel_JtextField_Jbutton(String title) throws HeadlessException {
        super(title);
    }
    
    
    public JPanel jlabel()
    {
        JPanel pane = new JPanel(new FlowLayout()); // tao 1 pane chua cac panel khac
        
        JPanel subpane1 = new JPanel(new FlowLayout());
        
        ImageIcon icon = new ImageIcon("/root/Desktop/download.png","new icon"); // tao 1 icon 
        
        JLabel label1= new JLabel("label1", icon, SwingConstants.CENTER); // tao 1 label voi icon ben tren 
        label1.setVerticalTextPosition(SwingConstants.CENTER); // setup vi tri cua text trong label (chieu doc)
        label1.setHorizontalTextPosition(SwingConstants.CENTER);// setup vi tri cua text trong label (chieu ngang)
        
        label1.setVerticalAlignment(SwingConstants.BOTTOM); // setup thu tu sap xep cua label trong container chua no tu day len 
        
        pane.add(label1, BorderLayout.WEST);  // add label1 vao pane va tu ben trai 
        
        return pane;   
    }
    
    public JPanel jtexfield()
            
    {
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        JTextField jtext = new  JTextField();
        jtext.setColumns(20); // chinh so cot trong textfield
        jtext.setText("huy"); // chinh text trong textfeild
        jtext.setForeground(Color.GREEN); // chinh mau chu 
        jtext.setHorizontalAlignment(JTextField.CENTER); // text dc sap xep o chinh giua
         
        jtext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jtext.selectAll();  // chon tat ca 
                jtext.setText("do van huy ");
             //   jtext.setEditable(false);
            }
        });
        
        pane.add(jtext);
        
        return pane;
    }
    
    
    
    
    public void showwindows()
    {
        setLayout(new BorderLayout());
        setSize(500, 500);      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(jtexfield(),BorderLayout.PAGE_START);
        add(jlabel(),BorderLayout.PAGE_END);
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Jlabel_JtextField_Jbutton win1= new Jlabel_JtextField_Jbutton("jlabel");
        win1.showwindows();
    }
}
