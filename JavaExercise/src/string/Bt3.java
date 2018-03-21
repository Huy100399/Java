package string;

import java.util.Scanner;

public class Bt3 {

	/*Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
	 *  Viết chương trình tách các từ t
	 * rong câu và in các từ theo thứ tự  Alphabet. */
	public static void tach_in(String str)
	{
		String []str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[j].codePointAt(0) < str1[i].codePointAt(0))
				{
					String dem=str1[j];
					str1[j]=str1[i];
					str1[i]=dem;
				}
			}
		}
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap sau  : ");
	    String str=new Scanner(System.in).nextLine();
		tach_in(str);
	}

}
