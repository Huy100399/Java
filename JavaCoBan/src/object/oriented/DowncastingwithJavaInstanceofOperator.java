package object.oriented;

// https://www.javatpoint.com/downcasting-with-instanceof-operator 
// https://www.youtube.com/watch?v=ja6107HrEQU&index=70&list=PLE1qPKuGSJaA6-6So-knCgNNq3vNbCRD6
class fruit
{
	
}

class apple extends fruit
{
	
}

class banana extends fruit
{
	
}

public class DowncastingwithJavaInstanceofOperator {
	
	
	
	
	public static void main(String[] args) {
	
		fruit a = new apple(); // upcasting (do noi trong phan polymorphism)
		apple b= (apple) a;  // downcasting , cau lenh nay k loi va co the downcasting dc la do a la instance cua class apple

		fruit c= new fruit();
		try 
		{
			apple d= (apple) c;// lenh nay se sinh ra loi vi c k phai la instace cua apple
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// muon downcasting hay upcasting dc thi cac bien doi tg p la instance cua nhau (la cac the hien cua nhau )
		fruit ap= new apple();
		fruit ba= new banana();
		
		if(ap instanceof banana)
		{
			apple ap1= (apple) ba;
			System.out.println("typecast is ok !");
		}
		else 
			System.out.println("can not typecast ! ");
		
	}
	
}
