package object.oriented;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class SV
{
	String name ; 
	int age;
	

	
	public String toString()
	{
		return String.format("name : %s   age : %d",this.name, this.age);
	}
	
	@SuppressWarnings("resource")
	public void input()
	{
		System.out.println("enter name : ");
		this.name= new Scanner(System.in).nextLine();
		System.out.println("enter age : ");
		this.age= new Scanner(System.in).nextInt();
	}

}

class DS
{
	SV []ds= new SV[100];
	int number;
	
	
	
	
	public DS() {
		super();
		System.out.println("nhap so luong sinh vien : ");
		this.number= new Scanner(System.in).nextInt();
	}

	public void inputDS()
	{
		
		for(int i=0; i<this.number;i++)
		{
			this.ds[i].input();
		}
	}
	
	public void outputDS()
	{
		for(SV temp : this.ds)
		{
			temp.toString();
		}
	}
	
	public void sort()
	{
		for(int i=0; i<this.number;i++)
		{
			for(int j= 0 ; j <this.number-1;j++)
			{
				if(this.ds[i].age<this.ds[j].age)
				{
					SV temp = new SV();
					
					temp.age= this.ds[i].age;
					temp.name= this.ds[i].name;
					
					this.ds[i].age= this.ds[j].age;
					this.ds[i].name= this.ds[j].name;
					
					this.ds[j].age=temp.age;
					this.ds[j].name= temp.name;
				}
			}
		}
	}
}


public class SwappObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SV []ds= new SV[11];
			System.out.println(ds.length);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	
			
	}

}
