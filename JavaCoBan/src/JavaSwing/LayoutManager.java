/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.swing.ImageIconUIResource;

/**flowlayout : https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html
 *boxlayout : https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html
 * @author root
 */
public class LayoutManager extends JFrame{

   public LayoutManager(String title)
   {
       super(title);
   }
   
   public void flowlayout()
   {
       
       setLayout(new FlowLayout());  // set layout manager cho frame
       // khi set layout manager cho frame la flow layout thi cac thanh phan se k the thay doi kich thuc , 
       // chung se dc dat trong contentpane sao cho phu hop nhat 
      
       JButton b2 = new JButton("button2");
       JButton b3 = new JButton("button3");
       JButton b4 = new JButton("button4");
       JButton b5 = new JButton("button5");
       JButton b6 = new JButton("button6");

       setSize(300, 300);
       getContentPane().setBackground(Color.yellow); // setup mau nen co content pane 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
       
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(b6);
    
   }
   
   public void boxlayout()
   {
       // nox layout se sap xep cac thanh phan thao hanh ngang  , hoac doc , nhung neu nhu kich thuoc conteiner chua n l du thi cac compoment se bi che khuat chu k tu xuong dong nhu flow layout
       
       JPanel jpan = new JPanel(); //doi tuong container chua cac compoment 
       
       jpan.setLayout(new BoxLayout(jpan, BoxLayout.X_AXIS));  // xep cac controls theo hanh ngang 
       
       
       JButton b2 = new JButton("button2");
       b2.setForeground(Color.yellow); // setup mau chu cho b2
       b2.setFont(new Font("s", Font.CENTER_BASELINE,WIDTH)); // set font va co chu cho b2
       JButton b3 = new JButton("button3");
       JButton b4 = new JButton("button4");
       JButton b5 = new JButton("button5");
       JButton b6 = new JButton("button6");

        
       jpan. add(b2);
       jpan.add(b3);
       jpan.add(b4);
       jpan.add(b5);
       jpan.add(b6);
       
       add(jpan);  // ad jpan va frame 
       setSize(300, 300);
       getContentPane().setBackground(Color.yellow); // setup mau nen co content pane 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
      
   }
   
   
   public void boderlayout()
   {
      
       JPanel pane = new JPanel();
       pane.setLayout(new BorderLayout());
               
       JPanel trai = new JPanel();
       trai.setBackground(Color.yellow);
       pane.add(trai, BorderLayout.WEST);
       
       add(pane);
       setSize(500, 500);
       getContentPane().setBackground(Color.yellow); // setup mau nen co content pane 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
   }
   
   
      
   public static void main(String[]args)
   {
       setDefaultLookAndFeelDecorated(true);
       LayoutManager flow = new LayoutManager("flowlayout demo");
       flow.flowlayout();
       
       LayoutManager box= new LayoutManager("boxlayout");
       box.boxlayout();
       
       LayoutManager boder = new LayoutManager("border");
       boder.boderlayout();
       
   }
}
