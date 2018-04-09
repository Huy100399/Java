package collections.in.java;

//https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
/*
 * quet bieu thuc tring to tu trai qua phai , gia su quet dc phan tu c
 * 
 * khoi tao 1 stack rong
 * 
 * neu c la toan hang noi c vao ket qua
 * 
 * neu c la ')' thi kiem tra neu stack khac rong ta se pop cac phan tu cua stack ra va noi vao ket qua cho den khi gap '('  , luu i k noi '('vao ket qua ma chi pop no di khoi stack
 * 
 * neu c la '(' push luon vao stack
 * 
 * neu c la 1 toan tu (+ , -, * ,/ ,^,..) thi kiem tra 
 * 
 * 1. neu stack rong thi push c vao stack
 * 2. neu stack k rong thi 
 * 		2.1 neu top() cua stack co muc do uu tien thap hon c thi push c vao stack 
 * 		2.2 neu top() cua stack co muc do uu tien >= c thi pop cac phan tu cua stack va noi vao ket qua cho toi khi top() cua stack co muc do uu tien thap hon c thi  luc do push c vao stack 
 * 
 * sau khi daa quet het bieu thuc dau vao , kiem tra xem neu stack k rong thi pop taat cac cac phan tu cua stack va noi vao ket qua
 */


import java.util.Stack;

import com.sun.org.apache.xpath.internal.SourceTree;

public class InfixToPostifix {
	
	public static int getpriority(char c)
	{
		if(c=='+' || c=='-') return 1;
		else if(c=='*' || c=='/' ) return 2;
		else if(c=='^') return 3;
		else return 0;
	}
	
	public static StringBuffer convert(String infix)
	{
		StringBuffer postifix= new StringBuffer();
		Stack<Character> stack=  new Stack<>();
		
		for(int i=0;i<infix.length();i++)
		{
			char c=infix.charAt(i);
			
			if(Character.isDigit(c)==true)
				postifix.append(c);
			if(c==')')
			{
				if(stack.isEmpty()==false)
				{
					while(stack.peek()!='(' )
					{
						postifix.append(stack.pop());
					}
					if(stack.peek()=='(') stack.pop();
				}
			}
			if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
			{
				if(stack.isEmpty()==true)
				{
					stack.push(c);
				}
				else
				{
					if(getpriority(c)>getpriority(stack.peek()))
					{
						stack.push(c);
					}
					else
					{
						while(stack.isEmpty()==false && getpriority(stack.peek())>=getpriority(c))
						{
							postifix.append(stack.pop());
						}
						stack.push(c);
					}
				}
			}
			if(c=='(') stack.push(c);
		
		}
		while(stack.isEmpty()==false) postifix.append(stack.pop());
		
		return postifix;
	}
	
	public static void main(String[] args) {
		
		String infix="(1+2)*3";
		System.out.println(convert(infix));
	}
	
}
