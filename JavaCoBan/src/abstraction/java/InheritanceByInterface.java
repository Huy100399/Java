package abstraction.java;

//https://www.tutorialspoint.com/java/java_interfaces.htm 
//https://www.javatpoint.com/interface-in-java
//https://www.geeksforgeeks.org/g-fact-73/

/*
 * mot interface co the extends mot interface khac 
 */


interface fruit
{
	int number= 1;
	void categories();
}

interface apple extends fruit
{
	int apple_number= 2;
	void color();
	void weight();
}

interface banana extends fruit
{
	int banana_number= 3;
	void price();
	
}

class fruit_A implements fruit
{// class fruit_A implements  fruit nen phai thu thi toan bo cac abstract method cua fruit
	public void categories()
	{
		System.out.println("this is fruit !");
	}
}

class apple_A implements apple
{// class nay implements apple , ma apple lai extends fruit nen class nay phai thuc thi 
	// toan bo cac abstract method cua fruit va apple 
	
	public void categories()
	{
		System.out.println("this in apple !");
	}
	
	public void color()
	{
		System.out.println("my apple is blue !");
	}
	
	public void weight()
	{
		System.out.println("this apple's weight is 0.5 kg !");
	}
	
}






public class InheritanceByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit f1= new fruit_A();
		apple f2= new apple_A();
		
		f1.categories();
		System.out.println("number'value of fruit interface : "+f1.number);
		
		System.out.println("\n");
		
		f2.categories();
		f2.color();
		f2.weight();
		System.out.println("number' value of apple interface :  "+f2.number);
	}

}

