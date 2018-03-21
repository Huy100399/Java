/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
//https://www.youtube.com/watch?v=ox-tsrRXGec&list=PLE1qPKuGSJaCmWIvdMmFovaYYxKlHIHAA&index=


public class ButtonHandling {
    
    JButton ok , cancel , exit;
    
    public void button1()
    {
        this.ok = new JButton("ok");
        this.ok.setSize(200, 400);
        this.ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showConfirmDialog(null, "confirm 1");
                /*
                tao mot hop thoai xac nhan , yes , no , cancel , title la "select an option"
                thong bao la "confirm1"
                */
                JOptionPane.showConfirmDialog(null, "confirm2", "huy", JOptionPane.OK_CANCEL_OPTION);
               /*
                hien hop thoai xac nhan , ok , cancel , title la "huy", thong bao la "confirm2"
                */
               
               JOptionPane.showConfirmDialog(null,"confirm3" ,"huy", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
               // nhu ham ben tren khac moi la them tham so cuoi cung la icon cua thong bao 
               
               JOptionPane.showInputDialog("huy");
               // hien thi hop thoai yeu cau nhap tt
              
               
             }
        });
               
        
        
    }
    
    
    
    public static void main(String []args)
    {
        JFrame frame = new JFrame("button handling");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLocationRelativeTo(null);
        
        frame.setSize(500, 500);
        
        ButtonHandling b1= new ButtonHandling();
        b1.button1();
        frame.add(b1.ok);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
    }
    
}
