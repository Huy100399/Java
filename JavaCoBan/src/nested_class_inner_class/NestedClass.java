package nested_class_inner_class;

import javax.xml.transform.Source;

// https://www.geeksforgeeks.org/nested-classes-java/ 

// https://www.tutorialspoint.com/java/java_innerclasses.htm 

public class NestedClass { // outerclass
	
	static int n ;// bien  static
	
	 int m ;// bien non-static(instace)
	
	 
	 
	 
	 
	public NestedClass(int m , int n ) {
		super();
		this.m = m;
		this.n=n;
	}

	static void print1()  // static method
	{
		System.out.println("print 1");
	}
	
	void print2() // non-static method
	{
		System.out.println("print 2");
	}
	
	static class class1 // nestedclass (khai bao static)
	{
		int a=1;

		
		// giong nhu static methods va bien static , nested class k the truy xuat truc tiep toi cac bien , hay cac phuong thuc 
	// non-static (instance)  trong outerclass  
		void display1()
		{
			System.out.println("n = "+n); // chi so the truy cap toi bien statuc cua outerclass
			//System.out.println("m= "+m); // k ther truy cap truc tiep toi bien non-static (bien instace )
			System.out.println("m ="+(new NestedClass(1,2)).m);// chi co the truy cap giaan tiep toi m thong qua doi tuong
			// tuong tu voi cac methods
			print1();// truy cap truc tiep toi static method
			
			(new NestedClass(1, 1)).print2(); // truy cap gian tiep den print 2
		}
		
	}
	// cac nested class va inner class deu la cac member cua uoter class
	
	
	 class class2 // innerclass(khong khai bao static)
	{
		int b=2;

	 void diplay2()
	 {
		 
		 // inner class co the truy cap truc tiep toi toan bo member cua outer class , ke ca private , static , non-static ...
		 System.out.println("n="+n);
		 System.out.println("m="+m);
		 print1();
		 print2();
	 }
		
	}
	
	public static void main(String[] args) {
		
		NestedClass.class1 obj1= new NestedClass.class1();  // khoi tao doi tuong cua class 1
		obj1.display1();
	
		// outerclass cx chi co ther truy cap gian tiep toi cac member cua nested class thong qua cac doi tuong cua nestedclass
		System.out.println(obj1.a);
		
		
		// de tao mot doi tuong moi cua inner class ta phai tao thong qua mot doi tuong cua outer class
		
		NestedClass obj = new NestedClass(1, 2);
		
		NestedClass.class2 obj2 = obj.new class2();
		obj2.diplay2();
		
	}
	
}
