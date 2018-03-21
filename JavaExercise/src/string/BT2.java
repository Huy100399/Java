package string;

import java.util.Scanner;

/*
 * Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài
 *  nhất trong xâu đó. Từ đó xuất hiện ở vị trí nào? (Chú ý. nếu 
 *  có nhiều từ có độ
 *  dài giống nhau thì chọn từ đầu tiên tìm thấy).*/

public class BT2 {
	public static void tim_tu_dai_nhat_1(String str)
	{
		String []str1=str.split(" ");
		int max=0;
		String str2="";
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].length()>max)
			{
				max=str1[i].length();
				str2=str1[i];
			}
		}
		
		System.out.println("tu dai nhat : "+str2);
		System.out.println("vi tri : "+str.indexOf(str2));
	}
	
	public static void tim_tu_dai_nhat_2(String str)
	{
		int size_max=0,index=0;
		String strmax="";
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				
				int j=i;
				while(str.charAt(j)!=' ')
				{
					j++;
					if(j==str.length()) break;
				}
				if(j-i>size_max)
				{
					size_max=j-i;
					strmax=str.substring(i, j);
					index=i;
				}
			}
		}
		System.out.println("tu dai nhat : "+strmax);
		System.out.println("vi tri : "+index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("nhap sau  : ");
	    String str=new Scanner(System.in).nextLine();
		tim_tu_dai_nhat_1(str);
		tim_tu_dai_nhat_2(str);
	}

}
