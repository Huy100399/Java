package Exception.handling;

public class Hello {
	public static void chia(int a , int b) throws CreatException // ben duoi throw loi thi tren cx p throws 
	{
		try 
		{
			System.out.println("a / b = "+a/b);
		}
		catch(Exception e)// bat loi , neu co loi thi nem 1 loi thuoc loi CreatException ra
		{
			throw new CreatException("loi chia 0");		
		}
		
	}
	
	
	public static void print3(int a, int b)
	{
		if(a<b)
			throw new ArithmeticException("loi gia tri !!!");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		try
		{
			print3(1,2);
		}
		catch(Exception e)
		{

			System.out.println("loi : "+e.getMessage());
		}
		
		try {
			chia(1,0);
			
		} catch (CreatException e) { // neu bat dc loi nem ra la createxception thi lam cau lenh trong catch
			// TODO Auto-generated catch block
			e.printStackTrace();// vi Createxception la ke thu cua class Exception nen cx doi tg cua n co the dung dc moi ham cua class Exception
			e.getError();
		}
		
		try {
			chia(1,1);
		}
		catch(CreatException e)//// neu bat dc loi nem ra la createxception thi lam cau lenh trong catch
		{
			e.printStackTrace();
			e.getError();
		}
		
		System.out.println("the end");
		
	}

}
