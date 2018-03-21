package object.oriented;
// https://www.javatpoint.com/runtime-polymorphism-in-java 
// https://www.tutorialspoint.com/java/java_polymorphism.htm
// https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/


class animals
{
	public int age = 1;
	public String sex= "male";
	public void run()
	{
		System.out.println("animal can run !");
	}
}

class dogs extends animals
{
	
	public int age = 2;
	public String color= "black";
	public void run()
	{
		System.out.println("dog can run !");
	}
}

class babydogs extends dogs
{
	int age= 4;
	
}

class cats extends animals
{
	public int age = 2;
	public void run()
	{
		System.out.println("cats can run !");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		//upcasting  
		
		animals a= new dogs() ; // khai bao doi tuog cua class cha , tham chieu toi doi tg class con (upcasting  )
		
		a.run();// se goi toi ham run cua dog class
		
		// runtime polymorphism
		
		animals b ;
		System.out.println("\n\nruntime polymorphism\n");
		b= new dogs();
		b.run();
		
		b= new cats();
		b.run();
		
		b= new animals();
		b.run();
		
		//  Java Runtime Polymorphism with Data Member 
		
		// runtime polymorphism k dung khi cta ap dung voi datamember
		System.out.println("Java Runtime Polymorphism with Data Member ");
		animals c; 
		
		// vi the nen cac lenh ben duoi deu goi toi datamember age cua class animals
		c= new animals();
		System.out.println("age = "+c.age);
		
		c= new dogs();
		System.out.println("age = "+c.age);
		
		c= new cats();
		System.out.println("age = "+c.age);
		
		
		// neu mot method cua class cha k dc overrided boi class con (tuc la class cha co nhg class con k co ) 
		//  thi neu doi tuong cua class cha tham chieu den class con va luc goi ham do bang doi tuong tham chieu toi class con thi ham trong class cha se dc goi 
		System.out.println("\n\n");
		animals d= new animals();
		d.run(); // goi ham rurn cua class animals binh thuong
		
		d= new dogs();
		d.run(); // goi ham run cua  class dog 
		
		d= new babydogs();
		d.run(); // tiep tuc goi ham run cua class dog vi trong class baby dog k override ham nay 
	
	
		//cac member cua class cha ma k bi ghi de trong class con , thi doi tuong cua class cha khi tham chieu toi class con chi co the goi toi cac ham trong 
		// class cha va cac ham nay k dc ghi de trong class con , con neu class con co cac member rieng biet ma class cha k co thi doi tg tham chieu nay k truy cap dc toi cac member do 
		animals e= new dogs();
		// trong trg hop nay , 
		System.out.println(e.sex);// sex co trong class animals nen e truy ca toi dc 
		//System.out.println(e.color);  // vi color la thuoc tinh chi co trong class dog nen e du tham chieu den class dog nhg cx k truy cap dc toi color
		
		
		
		
	}
	
	

}

