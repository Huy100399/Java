package object.oriented;

// https://www.javatpoint.com/downcasting-with-instanceof-operator

class A
{
	int a=1;
	
}

class B extends A
{
	int b=2;
}



public class JavaInstanceof_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obja= new A();
		B objb= new B();
		A obja1= new B();// upcasting
		// neu B ke thua A thi instance cua B cx la instance cua A , nhg instance cua A thi k p la instance cua B vi A la class cha cua B
		System.out.println("obja is instance of class A : "+(obja instanceof A) );
		System.out.println("obja is instance of class B : "+(obja instanceof B) );
		System.out.println("objb is instance of class A : "+(objb instanceof A) );
		System.out.println("obja is instance of class B : "+(objb instanceof B) );
		System.out.println("obja1 is instance of class A : "+(obja1 instanceof A) );
		System.out.println("obja1 is instance of class B : "+(obja1 instanceof B) );
		
		// instanceof in java with a variable that have null value 
		// neu mot bien doi tuong dc gan la null thi trong moi trg hop khi ta ap dung instanceof keyword cho n thi luon tra ve false
		
		A obja2= null;
		System.out.println("\n\nobja2 is instance of class A :"+(obja2 instanceof A));
		
		
	}

}
