/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studen.information.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author root
 */
public class StudentInformation extends JFrame{
    
    JTextField txtname = new JTextField() ;
    JTextField txtadress = new JTextField();
    TextArea display = new TextArea(1,1);
    JButton hienthi= new JButton();
    JButton thoat = new JButton();
    JCheckBox ankem, ankeo ;
    
    JRadioButton toan , tienganh;
    ButtonGroup monhocyeuthic;
    
    

    public StudentInformation(String title) throws HeadlessException {
       super(title);
       addcontrols();
       handling_event();
    }
    
    public void handling_event()
    {
        thoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int i= JOptionPane.showConfirmDialog(null, "ban co muon thoat k ");
                if(i==0 ) System.exit(0);
            }
        });
        
        hienthi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    showinfor();
                } catch (InterruptedException ex) {
                    Logger.getLogger(StudentInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void showinfor() throws InterruptedException {
                String infor;
                display.setText("name :"+txtname.getText()+"\ndiachi : "+txtadress.getText()+"\n");
                if(ankem.isSelected()== true && ankeo.isSelected()==false ) display.append("thic an kem \n");
                else if(ankem.isSelected()==true && ankeo.isSelected()==true) display.append("thic an kem vao keo \n");
                else if(ankeo.isSelected()==true && ankem.isSelected()==false) display.append("thic an keo ");
            
                JOptionPane.showMessageDialog(null,  display.getText(), JOptionPane.ICON_PROPERTY,JOptionPane.INFORMATION_MESSAGE);
           
            }
        });
    }
    
    public void addcontrols()
    {
        Container con = getContentPane();
        
        JPanel mainpane= new JPanel();
        mainpane.setLayout(new BoxLayout(mainpane, BoxLayout.Y_AXIS));
        
        
        
        JPanel pane_infor = new JPanel();
        pane_infor.setLayout(new BoxLayout(pane_infor, BoxLayout.Y_AXIS));
        
        
        
        JPanel name= new JPanel();
        name.setLayout(new FlowLayout());
        
        JLabel Jname= new JLabel();
        Jname.setText("Nhap Ten : ");
        Jname.setForeground(Color.GREEN);
        Jname.setFont(new Font("arial1", Font.BOLD, 20));
        
        txtname.setColumns(10);
        txtname.setForeground(Color.DARK_GRAY);
        txtname.setFont(new Font("arial2", Font.BOLD, 20));
        txtname.setHorizontalAlignment(JTextField.CENTER);

        name.add(Jname);
        name.add(txtname);
        pane_infor.add(name);
       
        
        JPanel adreess = new JPanel();
        adreess.setLayout(new FlowLayout());
        
        JLabel ad= new JLabel("Nhap Dia Chi : ");
        ad.setForeground(Color.GREEN);
        ad.setFont(new Font("arial1", Font.BOLD, 20));
        ad.setHorizontalAlignment(JLabel.CENTER);
        ad.setVerticalTextPosition(JLabel.CENTER);
        ad.setHorizontalTextPosition(JLabel.CENTER);
        
        txtadress.setColumns(10);
        txtadress.setForeground(Color.DARK_GRAY);
        txtadress.setFont(new Font("arial3", Font.BOLD, 20));
        txtadress.setHorizontalAlignment(JTextField.CENTER);
        
        adreess.add(ad);
        adreess.add(txtadress);
        pane_infor.add(adreess);
        
        
        JPanel screen = new JPanel();
        screen.setLayout(new BoxLayout(screen, BoxLayout.Y_AXIS));
       
        JLabel infor= new JLabel();
        infor.setText("Thong Tin");
        infor.setForeground(Color.DARK_GRAY);
        infor.setHorizontalAlignment(JLabel.CENTER);
        infor.setHorizontalTextPosition(JLabel.CENTER);
        infor.setVerticalTextPosition(JLabel.CENTER);
        infor.setVerticalTextPosition(JLabel.CENTER);
        infor.setFont(new Font("indam", Font.BOLD, 20));
        
        display.setForeground(Color.ORANGE);
        display.setFont(new Font("huy", Font.ITALIC, 20));
        
        screen.add(infor);
        screen.add(display);
        pane_infor.add(screen);
        
        
        JPanel sothicvabonhoc = new JPanel();
        sothicvabonhoc.setLayout(new GridLayout(1, 2));
        
        JPanel sothich = new JPanel();
        sothich.setLayout(new BoxLayout(sothich, BoxLayout.Y_AXIS));
        ankem = new JCheckBox("an kem ");
        ankeo = new JCheckBox("an keo");
        sothich.add(ankem);
        sothich.add(ankeo); 
        sothicvabonhoc.add(sothich);
        Border bordersothich;
        bordersothich = BorderFactory.createLineBorder(Color.RED);
        TitledBorder title = new TitledBorder(bordersothich,"so thich");
        title.setTitleColor(Color.GREEN);
        title.setTitleFont(new Font("sd", Font.BOLD, 10));
        sothich.setBorder(title);
        
        
        JPanel monhoc= new JPanel();
        monhoc.setLayout(new BoxLayout(monhoc, BoxLayout.Y_AXIS));
        toan= new JRadioButton("toan");
        tienganh= new JRadioButton("tieng anh ");
        monhoc.add(toan);
        monhoc.add(tienganh);   
        monhocyeuthic = new ButtonGroup();
        monhocyeuthic.add(toan);
        monhocyeuthic.add(tienganh);
        sothicvabonhoc.add(monhoc);
        Border bordermonhoc = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
        TitledBorder title1= new TitledBorder(bordermonhoc,"mon hoc");
        title1.setTitleColor(Color.DARK_GRAY);
        title1.setTitleFont(new Font("sds", Font.BOLD, 10));
        monhoc.setBorder(title1);
       
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout());
        
        hienthi.setForeground(Color.BLACK);
        hienthi.setFont(new Font("jss", Font.BOLD, 10));
        
        thoat.setForeground(Color.BLACK);
        thoat.setFont(new Font("jss", Font.BOLD, 10));
        
        button.add(hienthi);
        button.add(thoat);
       
        Border bordername = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder tiltle_name = new TitledBorder(bordername, "thong tin ");
        tiltle_name.setTitleColor(Color.RED);
        tiltle_name.setTitleFont(new Font("dskd", Font.BOLD, 20));
        pane_infor.setBorder(tiltle_name);
        
        mainpane.add(pane_infor);
        mainpane.add(sothicvabonhoc);
        mainpane.add(button);
       
        
        
        
        con.add(mainpane);

        
    }
    
    //@Override
;    public void showwindow()
    {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
}
