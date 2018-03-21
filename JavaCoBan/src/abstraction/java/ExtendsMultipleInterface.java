package abstraction.java;

//https://www.tutorialspoint.com/java/java_interfaces.htm 
//https://www.javatpoint.com/interface-in-java
//https://www.geeksforgeeks.org/g-fact-73/

/*
 * mot interface co the extends nhieu class khac bang cach su dung extends keyword
 * tu khoa extends chi can su dung mot lan trong trg hop mot interface extends nhieu interface khac
 */

// ta su dung cac class da khai bao trong file inheritancebyinterface

interface orange extends fruit , apple 
{
	void print();
}

class orange_a implements orange
{// class nay implement tu 2 interface fruit va apple nen phai thuc thi tat cac cac abstract method cua 2 interface do
	public void print()
	{
		System.out.println("hello orange !");
	}
	public void categories()
	{
		System.out.println("this is my orange !");
	}
	
	public void color()
	{
		System.out.println("my orange is blue !");
	}
	
	public void weight()
	{
		System.out.println("this orange's weight is 0.5 kg !");
	}
	
}

public class ExtendsMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		orange o = new orange_a();
		
		o.print();
		o.categories();
		o.color();
		o.weight();
		
	}

}
