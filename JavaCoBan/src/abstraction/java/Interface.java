package abstraction.java;

//https://www.javatpoint.com/interface-in-java 
//https://www.geeksforgeeks.org/interfaces-in-java-unpublished/
//https://www.tutorialspoint.com/java/java_interfaces.htm 


/*
 * interface cx co the co cac bien va phuong thuc , nhung cac phuong thuc cua interface mac dinh la abstract
 * interface chi hien thi , chi dinh nhg cai j ma 1 class implement no phai lam , k hien thi chi tiet cach thuc lam  , interface giong nhu 1 ban ve cho 1 class
 * 
 * bien trong interface trinh bien dich se mac dinh la public static final 
 * (vi du , trong interface t viet int a= 10 ; thi trinh bien dich se mac dinh la public static final int a =10)
 * cac method trong interface tg tu dc trinh bien dich mac dinh la  public abstract 
 * 
 * neu mot class inplement 1 interface thi class do phai thuc thi (cung cap day du lenh trong than ham) tat cac cac ham , phuong thuc cua interface do 
 * neu k thi class do phai dc khai bao la abstract 
 * 
 * 	
 */
// co ban cac bien , cac phuong thuc trong interface
interface  animal
{
	int number = 10;
	void run();
	void eat();
}

class dog implements animal
{
	public void run()
	{
		System.out.println("animal can run !");
	}
	
	public void eat()
	{
		System.out.println("animal can eat !");
	}
	
	
}

interface bank
{
	void salary();
}

 class BIDV implements bank
{
	public void salary()
	{
		System.out.println("salary of each employee of BIDV is : "+ 100+"$");
	}
}

class VietComBank implements bank
{
	public void salary() {
		System.out.println("salary of each employee of VietcomBank is :"+ 200+"$");
	}

}
// tu JDK 8 tro di thi compiler cho phep dinh nghia cac static method trong interface , cac static method nay co the goi ma k can doi tg 
// va nhg static method nay thi k cho cac class khac ke thua
interface newfuncions
{
	 static void funcion1()
	{
		System.out.println("this in new funcion was added in JDK 8 anwards ! ");
	}
}

public class Interface 

{
	public static void main(String[] args) {

	System.out.println("methods anh variables in interface !\n\n");
	animal d1= new dog();
	
	d1.run();
	d1.eat();
	System.out.println("number : "+d1.number);
	
	System.out.println("interface continue !\n\n");
	
	bank b1= new BIDV();
	bank b2 = new VietComBank();
	
	b1.salary();
	b2.salary();
	
	System.out.println("new funcion :\n\n");
	newfuncions.funcion1();
	
	}
	
}

//  Important points
/*
We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface (but only one interface).
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract. And all the fields are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.

*/




