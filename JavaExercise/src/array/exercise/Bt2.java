package array.exercise;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/*
 Nhập một dãy số a có n phần tử là các số nguyên. Đếm số lần xuất
  hiện của từng phần tử trong mảng. In phần tử có số lần xuất hiện 
  nhiều nhất trong a.*/


public class Bt2 {

	public static int[] input(int n)
	{
		System.out.println("nhap mang !");
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=");
			a[i]=new Scanner(System.in).nextInt();
		}
		return a;
	}
	
	public static void output(int []a)
	{
		for(int b : a)
		{
			System.out.printf("%4d",b);
		}
	}
	
	public static void count(int []a)
	{
		int max=0, value=0;
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			boolean trung=false;
			for(int j=0;j<i;j++)
			{
				if(a[j]==a[i]) trung=true;
			}
			
			if(trung == true) continue;
			else
			{
				for(int k=i;k<a.length;k++)
				{
					if(a[k]==a[i]) 
					{
						count++;
					}
				}
				if(count>max)
				{
					max=count;
					value=a[i];
				}
			}
			if(count>0) System.out.println("\n"+a[i]+" xuat hien"+ count + " lan !");
		}
		System.out.println(value+" xh nhieu nhat !");
	}
	public static void main(String[] args) {
		
		
		
		System.out.println("nhap so phan tu cua mang ");
		
		int n=new Scanner(System.in).nextInt();
		
		int []a=input(n);
		output(a);
		count(a);
	}

}
