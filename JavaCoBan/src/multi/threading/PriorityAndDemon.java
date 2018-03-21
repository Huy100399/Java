/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.threading;

/**
 *
 * @author root
 */

//https://www.javatpoint.com/priority-of-a-thread  

/*
moi thread co mot muc do uu tien rieng , no dc dai dien boi cac so tu 1- 10 

trong hau het cac truong hop thi thread schedular (lich trinh cac luong )
se len ke hoach thuc thi theo muc do uu tien cua moi thread (preemtive scheduling)
*/

/*
3 constants defined in Thread class:
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY
Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

*/
public class PriorityAndDemon {
    
    public static void main(String []args)
    {
        jointhread th1 = new jointhread();
        
        System.out.println("prioriy of thread th1 :"+th1.getPriority());
    }
}
