/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//https://www.javatpoint.com/join()-method

package multi.threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/**
 *
 * @author root
 */

/*
join() method nay doi cho thread thuc thi song nhiem vu (hay die) roi sau do moi cho cac 
thread khac thuc thi nhiem cua cua chung

trong trg hop khac join() method cx cho cung ta quy dinh thoi gian dung thuc thi cua 1 thread 
*/
class jointhread extends Thread
        
{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\nthread "+this.getName()+"\n");
        for(int i =1;i<=5;i++)
        {
            try {
                System.out.println("thread in running !__"+i);
                this.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(jointhread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("thread "+this.getId()+"exiting !");
    }

    @Override
    public synchronized void start() {
        System.out.println("\nstarting thread "+this.getId()+"\n");
        super.start(); //goi ham start() mac dinh trong Thread class , ham nay se goi toi ham run()
    }
    
    
    
    
}

public class TheJoinMethod {
    
    public static void main(String []args)
    {
       jointhread th1 = new  jointhread();
       jointhread th2 = new jointhread();
       jointhread th3 = new jointhread();
       jointhread th4= new jointhread();
       
       th1.start();
        try {
            th1.join(); // dung cac thread khac , cho cho thread 1 chay song moi cho cacl thread khac chay
        } catch (InterruptedException ex) {
            Logger.getLogger(TheJoinMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        th2.start();
        
        try {
            th2.join(10000); // dung cac thread khac trong vong 10s neu nhu tong 10s nay thread 2 chay song thi sex tiep tuc chay cac thread khac , neu khong thi sau 10s cac thread khac cung voi thread 2 dng chay do se chay dong thoi 
        } catch (InterruptedException ex) {
            Logger.getLogger(TheJoinMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        th3.start();
        th4.start();
        
        
    }
}
