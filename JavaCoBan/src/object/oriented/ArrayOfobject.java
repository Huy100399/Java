package object.oriented;

// http://www.javawithus.com/tutorial/array-of-objects

import java.util.Scanner;

class student
{
	String name; 
	int age;
	public student() {
		super();
	}
	
	public void studen_initialize()
	{
		System.out.println("enter name of student : ");
		this.name= new Scanner(System.in).nextLine();
		System.out.println("enter age of student :");
		this.age = new Scanner(System.in).nextInt();
	}
	
	public void display_student()
	{
		System.out.println("student's information :");
		System.out.println("name : "+this.name);
		System.out.println("age : "+this.age);
	}
	
	public String studen_toString()
	{
		return String.format("name : %s\nage : %d",this.name,this.age );
	}
}


class student_lits
{
	student []list;
	int number;
	
	public void list_initialize()
	{
		System.out.println("enter number student : ");
		this.number= new Scanner(System.in).nextInt();
		list = new student[this.number];
		for(int i=0;i<this.number;i++)
		{
			list[i]= new student();
		}
	}
	
	public void input_list1() // thong thuong
	{
		for(int i = 0;i<this.number;i++) 
		{
			list[i].studen_initialize();
		}

	}
	
	
	public void display_list()
	{
		for(int i = 0 ; i<this.number;i++)
		{
			list[i].display_student();
		}
	}
	
	public void sort()
	{
		for(int i =0;i<this.number;i++)
		{
			for(int j=i+1;j<this.number-1;j++)
			{
				if(list[i].age>list[j].age)
				{
					student temp= new student();
					temp= list[i];
					list[i]= list[j];
					list[j]= temp;
					// or 
//					temp.age= list[i].age;
//					temp.name= list[i].name;
//					
//					list[i].age= list[j].age;
//					list[i].name= list[j].name;
//					
//					list[j].age= temp.age;
//					list[j].name= temp.name;
					
					
				}
			}
		}
	}
}


public class ArrayOfobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student_lits list1= new student_lits() ;
		list1.list_initialize();
		list1.input_list1();
		list1.display_list();
		list1.sort();
		list1.display_list();
		
	}
}
