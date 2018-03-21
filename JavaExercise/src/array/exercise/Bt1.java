package array.exercise;

import java.util.Scanner;

/*
 Nhập dãy số a có n phần tử chỉ gồm các số nguyên dương. Kiểm tra mảng a
  có phải là mảng đối xứng hay không (ví dụ: 15 2 1 2 15 là mảng đối xứng).*/


public class Bt1 { 
	
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
			System.out.print("  "+b);
		}
	}
	
	public static boolean doixung(int []a)
	{
		int []b=new int[a.length];
		int i=a.length-1;
		for(int c : a)
		{
			b[i]=c;
			i--;
		}
		
	//	output(b);
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=b[j]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a;
		int n;
		System.out.println("nhap vao so phan tu cua mang  : ");
		n=new Scanner(System.in).nextInt();
		a=input(n);
		output(a);
		if(doixung(a)==true) System.out.println("\ndoi xung");
		else System.out.println("\nk doi xung");
		
	}

}
