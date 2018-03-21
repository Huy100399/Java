/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author root
 */

//https://www.geeksforgeeks.org/creating-frames-using-swings-java/

/*Jframe class
https://www.tutorialspoint.com/swing/swing_jframe.htm
*/

// c2 : dung ke thua class Jframe

class CreartFrame2 extends JFrame
{
   // JFrame frame;

    public CreartFrame2() throws HeadlessException {
        setTitle("creat frame 2");
        
        setSize(500, 500);
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button= new JButton("click");
        
        button.setBackground(Color.DARK_GRAY);
        
        button.setBounds(200,200 , 100, 100);
        
        add(button);
        
        setVisible(true);      
    }
    
    
}




// c1 : tao truc tiep 
public class CreatFrameBasic {
    
    public JFrame frame;
    
    public void creatnewframe1()
    {
        this.frame= new JFrame("frame Basic"); // tao 1 frame co text la "frame basic"
        JButton button = new JButton("huy");// tao mot button co text la "huy"
        
        button.setBackground(Color.yellow);// mau nen cua button
        
        button.setBounds(40,40 , 100, 100);// kich thuc va vi tri cua button trong frame
        
        this.frame.add(button); // them button vao frame
        
        this.frame.setSize(500,500); // kich thuoc frame
        
        this.frame.setLayout(null);
        
        this.frame.setVisible(true); // cho phep hien thi
        
        this.frame.setLocationRelativeTo(null); // hien thi frame chinh giua man hinh 
       
                
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tat hawn chuong trinh khi bam nut X tren cua so frame
    }
    
    public static void main(String []args)
    {
        CreatFrameBasic creat1= new CreatFrameBasic();
        
        creat1.creatnewframe1();
        
        CreartFrame2 creat2= new CreartFrame2();
        
        
            
        
    }
}
