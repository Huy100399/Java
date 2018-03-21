/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
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

public final class ButtonHandling2 extends JFrame implements ActionListener{
    

   JButton okbutton, cancelButton, exitbutton;

    public ButtonHandling2() throws HeadlessException {
        creatAndShow();
        
    }
    
    
    
    public void creatAndShow()

    {
        okbutton = new JButton("ok");
        cancelButton = new JButton("cancel");
        exitbutton = new JButton("exit");   
        
        
                
        
        this.setSize(500, 500);
        
        this.add(okbutton);
        okbutton.setActionCommand("ok"); // thiet lap command cua okbutton khi dc bam la "ok"
        okbutton.addActionListener(this);
              
        this.add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
                
        this.add(exitbutton);
        exitbutton.setActionCommand("exit");
        exitbutton.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10 ));
        
        // https://www.javatpoint.com/FlowLayout cach fung flowlayout
        //https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html
        
        
        this.setVisible(true);
                
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
            if("ok".equals(ae.getActionCommand()))  // neu button vua bam co command la "ok" thi lam ben trong
            {
                 JOptionPane.showMessageDialog(this, "you hava iust press okbutton !");
       
           
            }
        if("cancel".equals(ae.getActionCommand()))
        {
            JOptionPane.showMessageDialog(this, "you have iust press canclebutton !");
        }
        
        if("exit".equals(ae.getActionCommand()))
        {
          
            System.exit(0);
        }
    }
    
    
    
    public static void main(String []args)
    {
        ButtonHandling2 b= new ButtonHandling2();
        
    }
}
