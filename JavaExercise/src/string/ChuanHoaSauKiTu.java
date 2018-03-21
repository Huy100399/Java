package string;

import java.util.Scanner;

public class ChuanHoaSauKiTu {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chuanhoasau str=new chuanhoasau();
		str.nhap_sau();
		str.chuan_hoa();
		str.xuat_sau();
		
	}

}

class chuanhoasau{
	String str;
	
	public chuanhoasau() {
		str=new String();
	}
	
	public void nhap_sau()
	{
		System.out.println("nhap sau : ");
		str=new Scanner(System.in).nextLine();
	}
	
	public void xuat_sau()
	{
		System.out.println(str);
	}
	
	public void chuan_hoa()
	{
		str.toLowerCase();
		String []str1= str.split(" ");
		String str2="";
		for(int i=0;i<str1.length;i++)
		{
			String str3="";
			
				if(str1[i].length()==1)
				{               
					if(Character.isLetter(str1[i].charAt(0))==true)
					{
						str3+=Character.toUpperCase(str1[i].charAt(0));
						str3+=" ";
					}
					else str3+=str1[i].charAt(0);
				}
				else if(str1[i].length()==2)
				{
					if(str1[i].charAt(0)=='.')
					{
						str3=str3+str1[i].charAt(0)+" "+Character.toUpperCase(str1[i].charAt(1));
						str3+=" ";
					}
					else 
					{
						str3=str3+Character.toUpperCase(str1[i].charAt(0))+str1[i].charAt(1);
						str3+=" ";
						
					}
				}
				else if(str1[i].length()>2)
				{
					if(str1[i].charAt(0)=='.')
					{
						str3+=str1[i].charAt(0)+" ";
						str3=str3+Character.toUpperCase(str1[i].charAt(1))+str1[i].substring(2);
						str3+=" ";
					}
					else
					{
						str3=str3+Character.toUpperCase(str1[i].charAt(0))+str1[i].substring(1);
						str3+=" ";
					}
				}
			
				str2+=str3;
			}
		//if(str2.charAt(str2.length()-1)==' ') str2+='\b';  // xoa dau cach cuoi cung neu co
		
		str=str2;
	}
}