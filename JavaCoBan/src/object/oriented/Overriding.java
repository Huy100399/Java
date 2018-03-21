package object.oriented;


// https://www.geeksforgeeks.org/overriding-in-java/
// https://www.tutorialspoint.com/java/java_overriding.htm

class animal
{
	boolean talk= false;
	void print()
	{
		System.out.println("animal can eat !");
	}
	
	static void hiden()
	{
		System.out.println("animal");
	}
}

class dog extends animal
{
	boolean dance= false;
	void print()
	{
		System.out.println("dog can run !");
	}
	
	void dance()
	{
		System.out.println("dog can not dance !");
	}
	// dung super de goi cac ham bi overri cua class cha 
	void print2()
	{

		print(); // goi ham print cua class con 
		super.print(); // goi ham print cua class cha
	}
	
	static void hiden()
	{
		System.out.println("dog");
		
	}
	
	void print3()
	{
		hiden();
		super.hiden();
	}

}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a = new animal();
		dog b = new dog();
		animal c = new dog(); 
		
		a.print();
		b.print();
		c.print();// du c la doi tuong cua animal nhg van chay ham print cua class dog khi khai bao c nhu tren 
		// nhg vi animal va dog cung co ham la print nen c moi goi dc ham print cua dog class 
		// con c k the goi toi ham dance cua dog class
		// c co ther truy cap den moi thanh pan  cua class animal neu cac  thanh phan do k co cung ten voi cac thanh phan trong class con cua no 
		b.print2();
		
		
		// neu 2 phuong thuc trong class cha va class con du co cung ten , kieu trar ve , ds tham so , nhg neu deu la private thi chung hoan toan doc lap  nhau
		b.print3();
		b.hiden();  // goi ham hiden() trong class con
		c.hiden(); // goi ham hiden() trong class cha 
	}
}
