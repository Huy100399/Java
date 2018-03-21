package nested_class_inner_class;
// https://www.tutorialspoint.com/java/java_innerclasses.htm 
public class MethodlocalInnerClass {
	
	int a;
	
	void print1()
	{
		int m= 1;
		
		class localinnerclass
		{
			int n = 2;
			 
			void print()
			{
				System.out.println("a = "+a);
				System.out.println("m="+m);
				System.out.println("n="+n);
			}
		
		}
		localinnerclass obj = new localinnerclass();
		
		obj.print();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodlocalInnerClass OBJ= new MethodlocalInnerClass();
		OBJ.print1();
		
	}

}
