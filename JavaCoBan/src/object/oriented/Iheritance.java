package object.oriented;
// https://www.tutorialspoint.com/java/java_inheritance.htm 
class superclass
{
	public int  a ;
	protected  int b;
	public  int c;
	
	
	public superclass(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void tong()
	{
		System.out.println("tong = "+(a+b));
	}
	
	void hieu()
	{
		System.out.println("hieu = "+(a-b));
	}
	
}

public class Iheritance  extends superclass
{//  class Iheritance chi ke thua dc cac member , thuoc tinh cua class cha neu cac thanh phan nay la k phai private , va no cung k ke thua ham tao 
	
	public Iheritance(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	void tich()
	{
		System.out.println("tich = "+a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iheritance obj1= new Iheritance(1, 1, 1);
		
		obj1.tong();
		obj1.hieu();
		obj1.tich();

		
		superclass  obj2= new Iheritance(1, 2,3); // neu tao doi tuong obj2 ntn thi se k the truy cap toi cac member cua class inheritance
		obj2.tong();
		obj2.hieu();
	}

}
