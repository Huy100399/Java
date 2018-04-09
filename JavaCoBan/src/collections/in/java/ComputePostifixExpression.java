package collections.in.java;

import java.util.Stack;

import com.sun.org.apache.xpath.internal.SourceTree;

import sun.security.krb5.internal.ccache.CCacheOutputStream;

//https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/



public class ComputePostifixExpression {
	
	public static float computePostifix(String postifix)
	{
		float result=0;
		Stack<Float> stack= new  Stack<>();
		for(int i=0;i<postifix.length();i++)
		{
			char c= postifix.charAt(i);
			
			if(Character.isDigit(c)==true)
			{
				stack.push((float)Character.getNumericValue(c));
			}
			else
			{
				switch(c)
				{
				case '+':
					{
						stack.push(stack.pop()+stack.pop());
						break;
					}
				case '-':
					{
						stack.push(-stack.pop()+stack.pop());
						break;
					}
				case '*':
					{
						stack.push(stack.pop()*stack.pop());
						break;
					}
				case '/':
					{
						float a1= stack.pop();
						float a2= stack.pop();
						stack.push(a2/a1);
						break;
					}
				case  '^':
					{
						float a1= stack.pop();
						float a2= stack.pop();
						stack.push((float)Math.pow(a2,a1));
						break;
					}
					
				}
			}
		}
		result=stack.peek();
		return result;
	}

	public static void main(String[] args) {
		
		String postifix="12+3*";
		System.out.println(computePostifix(postifix));
	}
	
}
