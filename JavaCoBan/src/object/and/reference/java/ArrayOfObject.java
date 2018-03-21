package object.and.reference.java;

import java.util.Scanner;

// http://www.javawithus.com/tutorial/array-of-objects 

class car 
{
	int number;
	
	public void enter_num()
	{
		System.out.println("enter number of car : ");
		this.number= new Scanner(System.in).nextInt();
	}
	
	public int getnum()
	{
		return this.number;
	}
	
	public void display()
	{
		System.out.println("number : "+ this.number);
	}
}



public class ArrayOfObject {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// muon co mot mang doi tg thi ta can p khoi tao cho manh do 
		car []ex= new car[4]; // khai bao mang ex co the chua 4 tham chieu den 4 doi tuong car
		
		for(int i = 0 ; i<ex.length;i++) // khoi tao tung phan tu trong mang 
		{
			ex[i]= new car();
		}

		// trong java co the dung vong lap for reach de thay doi thon tin oject 
		
		for(car temp : ex) // bien temp tham chieu toi doi cua tung phan tu manh nen co the thay doi thong tin cua chung
		{
			temp.enter_num();
		}
		
	  
		
		for(car temp : ex)
		{
			temp.display();
		}
	}

}
