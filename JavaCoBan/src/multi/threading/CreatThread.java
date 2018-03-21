package multi.threading;

// creat thread by extends thread class

import java.util.logging.Level;
import java.util.logging.Logger;


class thread1 extends Thread
{
	public thread1() {
		// TODO Auto-generated constructor stub
		System.out.println("creat new thread !"+this.getId()
                );
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=5;i++)
		{
			System.out.println("thread is running !"+this.getId()+"_"+i);
			try {
				this.sleep(1000);
				System.out.println("thread "+this.getId()+" non-runable (blocked)");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread exiting"+this.getId());
	}
	
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("start thread !"+this.getId());
		super.start();
		
	}

}


// creat threat by implement runnable inteface 

class thread2 implements Runnable
{

    public thread2() {
        
        System.out.println("cread thread of thread 2 !");
    }
    
    

    @Override
    public void run() {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("running thread of thread 2 !");
        }
        System.out.println("thread exiting !");
    }
      
}

  

   
    


/**
 *
 * @author root
 */
public class CreatThread {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 th1= new thread1();
                thread2 th2= new thread2();
		th1.start();
                th2.run();
                
                
	}

}
