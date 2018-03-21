package object.oriented;
// https://www.tutorialspoint.com/java/java_inheritance.htm

// supper dung de phan biet member trung ten cua class cha va class ke thua 
// va dung de goi ham tao cua class cha tu class ke thua

class supperclasss
{
	
	int a = 20 ;
	int b;
	
	
	public supperclasss(int b) {
		this.b = b;
	}


	void print()
	{
		System.out.println("this is print method of supperclass !");
	}
}


public class Supper_KeyWord extends supperclasss{
	
	
	

	int a=10;
	int c;
	
	public Supper_KeyWord(int b, int c) { // super con dung de goi ham tao cua class cha 
		super(b); // cau lenh nay tg tu voi ham tao cua class cha (supperclasss)
		this.c = c;
	}

	void print()
	{
		System.out.println("this is print method of supper_keyword class !");
		
	}
	
	void print1()
	{
		System.out.println("'a' of supperclasss : "+super.a);
		System.out.println("'a' od supper_keyword class "+a);
		
	}
	
	void print2()
	{
		System.out.println("phan biet 2 method chung ten cua class con va class cha");
		print(); // ham print cua lop con 
		super.print(); // ham print cua lop cha
	}
	
	

	public static void main(String[] args) {
		
		Supper_KeyWord  obj1= new Supper_KeyWord(2,3);
		obj1.print(); 
		
		obj1.print1();
		
		obj1.print2();
		System.out.println("b+c="+(obj1.b+obj1.c));
	}

}
