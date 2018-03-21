package object.oriented;

// https://www.javatpoint.com/covariant-return-type

class AI
{
	int value=1;
	
	AI get()
	{
		return this;
	}
	
}

class BB extends AI
{
	float value1=2;
	
	BB get() // tuy khac kieu tr ve nhg van override dc trong th nay 
	{
		return this;
	}
	

	public void print()
	{
		System.out.println("welcome !");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB b = new BB();
		b.print();
		
	}

}
