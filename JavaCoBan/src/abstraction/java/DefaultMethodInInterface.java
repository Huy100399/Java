package abstraction.java;

//https://www.javatpoint.com/interface-in-java
/*
 * tu java 8 ta co the co mot body cua method trong interface , nhg method do p dc khai bao la default
 */

interface defaultmethod
{
	default void print()
	{
		System.out.println("this is defalut method in interface !");
	}
	
	void write();
}

class example implements defaultmethod
{
	// class nay implement defaultmethod   nhg chi can thuc thi ham write , vi ham print la mac dinh r
	public void write()
	{
		System.out.println("this is write method !");
	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		defaultmethod  df= new example();
		
		df.print();
		df.write();
		
	}

}
