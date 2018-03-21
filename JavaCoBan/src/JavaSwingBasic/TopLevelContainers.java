/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwingBasic;

import JavaSwing.lable;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author root
 * https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html#contentpane
 * 
 * 
 * 
 */
public class TopLevelContainers extends  JFrame {

    public TopLevelContainers(String title) throws HeadlessException {
        super(title);
    }
    
    public void AddingComponentsToTheContenPane()
    {
        // this.getContentPane() : tra ve contentpane cua 1 JFrame objetc.
        
        this.getContentPane().add(new JButton("button1"));  // them button voa content pane cua frame
        this.getContentPane().setBackground(Color.yellow); // set mau cho content pane

      // Adding a Menu Bar
        JMenuBar menu = new JMenuBar();
        menu.setBackground(Color.BLUE);
       // this.setJMenuBar(menu);
    }
    
    
    public void initAndShow()
    {
        setUndecorated(rootPaneCheckingEnabled);
        setSize(500, 500);
      //  pack(); // tu set up kich thuoc cua frame sao cho vua du voi cach thanh phan
        setIconImage(new ImageIcon("/root/Pictures/03588_morrainelake_4096x2160.jpg").getImage());
        // thiet lap icon cho frame
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER));// dat cac thanh phan nhu button ow giua
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        setDefaultLookAndFeelDecorated(true); // thiet lap mot dang frame khac dep hon
        
        TopLevelContainers ex1 = new TopLevelContainers("example1"); 
        ex1.AddingComponentsToTheContenPane();
        ex1.initAndShow();
    }
}
