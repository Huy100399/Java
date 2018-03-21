/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */

//https://www.javatpoint.com/join()-method  

// public static Thread currentThread(): tra ve mot tham chieu toi 1 thread hien dang thuc thi 

public class Getname_Setname_GetId_Method {
    
    public static void main(String []args)
    {
        
        jointhread th1= new jointhread();
        System.out.println("name of th1 before rename : "+th1.getName());
        System.out.println("id of th1 : "+th1.getId());
        
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Getname_Setname_GetId_Method.class.getName()).log(Level.SEVERE, null, ex);
        }
        th1.setName("new name ");
        
        System.out.println("name of th1 after rename : "+th1.getName());
        System.out.println("id of th1 : "+th1.getId());
        
        System.out.println("\nexample about currentThread() method : \n");
        
        jointhread th2= new jointhread();
        jointhread th3 = new jointhread();
        
        th2.start();
        th3.start();
        System.out.println("the current thread is running is :"+Thread.currentThread().getName());
    }
}
