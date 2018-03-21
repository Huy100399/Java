package method.in.java;

public class VariableArguments {

	public static void print(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void print2(int a , int b , int ... c)
	{
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<c.length;i++)
			
		{
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1,2,3,4);
		print2(1, 2, 3,4,5,6);
		print2(1, 2, 'A','A');
	}

}
