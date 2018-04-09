package collections.in.java;

import java.util.Scanner;
import java.util.Stack;

public class StackInJava {
	
	public static void addelement(Stack<Integer>stack , int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("nhap phan tu can add vao stack :");
			stack.push(new Scanner(System.in).nextInt());
		}
	}
	
	public static void showelement(Stack<Integer>stack)
	{
		while(stack.isEmpty()==false)
		{
			System.out.println(stack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Stack<Integer> stack = new Stack<>();
		addelement(stack, 5);
		showelement(stack);
 			
	}
	

}
