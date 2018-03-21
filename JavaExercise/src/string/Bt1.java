package string;

import java.util.Scanner;

public class Bt1 {
	
	/*
	 * Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng 
	 * liệt kê các số thuận nghịch có 6 chữ số. */
	
	public static boolean sothuannghich1(int n)
	{
		int tg=0,m=n;
		while(m!=0)
		{
			tg=tg*10+m%10;
			m/=10;
		}
		if(tg==n) return true;
		else return false;
	}
	
	public static boolean sothuannghich2(int n)
	{
		String str=String.valueOf(n);
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false ;
		}
		return true;
	}
	
	public static boolean sothuannghich3(int n)
	
	{
		StringBuffer str= new StringBuffer(n);
		return(str==str.reverse());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
	System.out.println("nhap n = ");
	n=new Scanner(System.in).nextInt();
	System.out.println(sothuannghich1(n));
	System.out.println(sothuannghich2(n));
	System.out.println(sothuannghich3(n));
	}

}
