/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studen.information.ui;

import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class Run {
    
    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        StudentInformation win1= new StudentInformation("win1");
        win1.showwindow();
    }
    
}
