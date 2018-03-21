package Exception.handling;

import java.io.FileNotFoundException;

import javax.xml.transform.Source;

// link : https://www.tutorialspoint.com/java/java_exceptions.htm 
// link : https://www.tutorialspoint.com/java/io/java_io_exceptions.htm 
// link : https://www.javatpoint.com/throw-keyword

// throw, thows :  https://www.youtube.com/watch?v=lGh13KdAS6g&index=70&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w 
public class ExceptionHandling {
	
	// throws
		public static void print() throws Exception{ // neu co loi thi ham print se nem ra 1 Exception
			System.out.println(1/0); // neu cau lenh nay co loi thi ham se nem loi ra va k thu c hien cau lenh tiep theo cua ham nay
			System.out.println("huy");
		}
		

		public static void print1() throws ArrayIndexOutOfBoundsException, ArithmeticException
		{// co thee nem ra nhieu loi khi dung throws , khi gap loi dau tien thi ham sex nem ra ngay loi do
			int []a= new int [2];
			System.out.println(1/0);
			System.out.println(a[4]);
		}
		
		// throw
		
		public static void print2()
		{
			System.out.println("huy2");
			throw new ArithmeticException();// sau lenh nay thi ham nem ra 1 ngoai le nen cac lenh sau trong ham se k dc thuc hien 
			
		}
		
		public static void main(String[] args)   
		{
				try {
					print(); // vi ham print co the se nem ra 1 exception ne bat cu ham nao dung n cx p bo trong try catch de bat loi neu co 
				} catch (Exception e) {// neu nhu print() nem raa 1 loi thi nahy vao trong catch
					// TODO Auto-generated catch block
					System.out.println("print co loi xay ra !");
				}
				
				try
				{// nhu tren thi ham se nem ra loi chia 0 va nhay vao catch

					print1();
	
				}
				catch( Exception e) // catch bat loi , nhan dc la loi chia 0 nen se nem ra loi chia 0
				{
					System.out.println("loi"+e);
				}
				System.out.println("end");
				try
				{
					print2();
				}
				catch(Exception e)
				{
					System.out.println("loi"+e);
				}
				
				System.out.println("end");
			
				
		}
	   
}
