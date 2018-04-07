package regular.expressions;

import java.util.Scanner;

public class RegularEpressions {

//	/http://laptrinhandroid.vn/bieu-thuc-chinh-quy-regular-expressions-trong-java/
	//https://www.javatpoint.com/java-regex
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex= "";
		boolean match=false;
		while(match==false)
		{
			System.out.println("nhap vao ten cua ban :");
			String s= new Scanner(System.in).nextLine();
			System.out.println(s.matches(regex));
			if(s.matches(regex)==true) break;
			
		}
		

	}

}
