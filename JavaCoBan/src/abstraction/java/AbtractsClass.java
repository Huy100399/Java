package abstraction.java;

//https://www.javatpoint.com/abstract-class-in-java 
//https://www.geeksforgeeks.org/abstract-classes-in-java/
//https://www.tutorialspoint.com/java/java_abstraction.htm

/*
 *  mot class co tu khoa abstract trk khai bao dc coi la mot abstract class 
 *  mot abstract class k the tu khoi tao doi tuong (instance) cua no 
 *  mot abstract class can dc class khac ke thua , va cac phuong thuc cua n can dc thu thi nho cac class ke thua do 
 *  
 *  mot abstract method la mot method dc khai bao la abstract va khong co body cua phuong thu 
 */

abstract class car // abstract class
{
	abstract void print(); // abstract method, neu nhu class co abstact method thi class do p dc khai bao la abstract class
	
	// abstract class cx co he co mot constructor , contsructor nay dc goi khi 1 doi tuong(instance) cua lop con cua no dc tao ra 
	public car ()
	{
		System.out.println("this is car's constructor !");
	}
	
	// abstract class cx co the co cac datamember , method thong thuong nhu cac class khac 
	int value=100 ;
	
	public void print1()
	{
		System.out.println("this is method of class car !");
	}
	
	// abstract class cx co the co cac final method , ...
	
	final public void finals()
	{
		System.out.println("this is final method of car class !");
	}
	    
}



class lezux extends car // class ke thua cua abstract class phai thuc hien cac method cua abstract class ben trong than ham neu k se loi 
{
	// mot class ke thua tu mot abstract class thi hoac la phai thuc thi cac ham abstract cua class cha hoac phai la mot abstract class
	
	public lezux()
	{
		System.out.println("this is lezux's constuctor !"); // constructor cua class lezux se dc goi sau constructor cua class car
	}
	
	void print() // thuc thi ham print trong class car 
	{
		System.out.println("this is lezux !");
	}
}


public class AbtractsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		car c1= new car(); //  class car k the tu khoi tao 1 instance 
		
		car c1= new lezux();// (upcasting ) khoi tao va tham chieu toi instance cua class lezux
		c1.print();
		c1.finals();
		
		System.out.println("\n\n");
		// khi tao doi tg cua calss c2 theo cach truyen thong nhu ben duoi thi constructor cua car 2 class van dc goi 
		lezux c2= new lezux();
		c2.finals();
		
		car []c3= new car[5]; // k the tao doi tg nh class ca van co the coi la 1 kieu du lieu nen co the tao ra mang de tham chieu toi cac doi tg cua cac class con
	}

}
