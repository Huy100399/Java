/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gptb1.ui;

import com.sun.jndi.url.iiop.iiopURLContext;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author root
 */
public class PtBac1 extends JFrame {
    
    
    JButton giai= new JButton("giai");
    JButton thoat = new JButton("thoat");
    JTextField txtb= new JTextField();
    JTextField txta = new JTextField();
    JTextField KQ= new JTextField();

    public PtBac1(String title) throws HeadlessException {
        super(title);
       
    }
    
    public void addcontrols()
    {
        Container con = this.getContentPane();
       
        JPanel mainpane = new JPanel();
        mainpane.setForeground(Color.yellow);
        mainpane.setLayout(new BoxLayout(mainpane, BoxLayout.Y_AXIS));
        con.add(mainpane);
 
        JPanel pntitle= new JPanel(new FlowLayout());
        JTextField title = new JTextField();
        title.setText("giai pt bac 1");
        title.setForeground(Color.RED);
        title.setEditable(false);
        title.setHorizontalAlignment(JTextField.CENTER);
        Font font = new Font("arial", Font.BOLD, 20);
        title.setFont(font);
        pntitle.add(title);
        mainpane.add(pntitle);
        
        
        JPanel heso_a= new JPanel(new FlowLayout());
        JLabel hsa= new JLabel("he so a : ");
        hsa.setForeground(Color.GREEN);
        txta.setColumns(20);
        txta.setHorizontalAlignment(JTextField.CENTER);
        txta.setForeground(Color.RED);
        Font fon1= new Font("aria1", Font.BOLD, 20);
        heso_a.add(hsa);
        heso_a.add(txta);
        mainpane.add(heso_a);
        
        JPanel heso_b= new JPanel();
        heso_b.setLayout(new FlowLayout());
        JLabel hsb= new JLabel("he so b : ");
        hsb.setForeground(Color.GREEN);
        txtb.setColumns(20);
        txtb.setHorizontalAlignment(JTextField.CENTER);
        txtb.setForeground(Color.RED);
        Font fon2= new Font("arial2", Font.BOLD, 20);
        heso_b.add(hsb);
        heso_b.add(txtb);
        mainpane.add(heso_b);
        
        JPanel ketqua= new JPanel();
        ketqua.setLayout(new FlowLayout());
        JLabel kq= new JLabel("ket qua : ");
        kq.setForeground(Color.BLUE);
        kq.setHorizontalTextPosition(JLabel.CENTER);
        kq.setVerticalTextPosition(JLabel.CENTER);
        kq.setFont(new Font("arial3", Font.ITALIC, 20));
        ketqua.add(kq);
        KQ.setColumns(10);
        KQ.setForeground(Color.ORANGE);
        KQ.setFont(new Font("sdd", Font.TRUETYPE_FONT, 20));
        KQ.setHorizontalAlignment(JTextField.CENTER);
        ketqua.add(KQ);
        mainpane.add(ketqua);
                        
        
        
        
        JPanel giai_thoat = new JPanel();
        giai_thoat.setLayout(new FlowLayout());
        
        
        giai.setHorizontalTextPosition(JButton.CENTER);
        giai.setVerticalTextPosition(JButton.CENTER);
        giai.setVerticalAlignment(JButton.CENTER);
        
        giai_thoat.add(giai);
        giai_thoat.add(thoat);
        mainpane.add(giai_thoat);
    }
    
    
     
    
    
    ActionListener giai_event = new ActionListener() {
        @Override  
        public void actionPerformed(ActionEvent ae) {
            giaiptb1();
        } 
        private void giaiptb1() {

            boolean kiemtra= true;
            do
            {
                if(txta.getText().isEmpty() == true || txtb.getText().isEmpty()== true)
                {
                    kiemtra=false;
                     JOptionPane.showInternalMessageDialog(null, "nhap du 2 he so a b");
                  //   break;
                }
                   
            }
            while(kiemtra==false);
            
            double hsoa = Double.parseDouble(txta.getText());
            double hsob= Double.parseDouble(txtb.getText());
            
            if(hsoa==0 && hsob==0)
            {
               KQ.setText("vo so nghiem !");
            }
            else if(hsoa  == 0 && hsob!=0 )
            {
                KQ.setText("vo nghiem !");
            }
            else if(hsoa != 0 && hsob ==0)
            {
                KQ.setText("x = 0");
            }
            
            else 
            {
                KQ.setText("x = "+(double)-hsob/hsoa);
            }     
        }
    };
    
    
    
    public void addevent()
    {
         thoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "thoat !");
                System.exit(0);
            }
        });
         
       giai.addActionListener(giai_event);   
    }
    
    public void showwindows()
    {
        setSize(500,400);
        addcontrols();
        addevent();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

   
    }
    
    
   

