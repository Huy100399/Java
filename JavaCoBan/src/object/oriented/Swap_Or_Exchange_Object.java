package object.oriented;

//https://www.geeksforgeeks.org/swap-exchange-objects-java/ 


// neu ta bit chinh xac cac thuoc tinh cua class la nhx thuoc tinh nao thi ta co the de dang hoan doi data cua doi tuong 
// theo cach thong thuong do la doi ch tung thuoc tinh mot cho nhau , nhg trong th ta k biet doi tg co nhx thuoc tinh na thi t p tao mot
// class khac der doi cho nhu o ben duoi 
class car
{
	String name;
	int  number;
	public car(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public void print()
	{
		System.out.println("name : "+this.name);
		System.out.println("number : "+this.number);
	}
	
	public String toSting()
	{
		return String.format("nam : %s   number : %d",this.name, this.number);
	}
}


class swappcar // class nay co thuoc tinh la car 
{
	car c;

	public swappcar(car c) {
		super();
		this.c = c;
	}
	
}

public class Swap_Or_Exchange_Object {

		public static void swapper(swappcar c1 , swappcar c2) // ham doi cho 
		{
			car temp= c1.c;
			c1.c=c2.c;
			c2.c=temp;
		}
		
		
		public static void main(String[] args) {
			car c1= new car("lesux", 1);
			car c2= new car("lamboghini", 2);
			
			System.out.println("before swap :");
			System.out.println("c1's information : "+c1.toSting());
			System.out.println("c2's information : "+c2.toSting());
			
			swappcar sw1= new swappcar(c1);
			swappcar sw2= new swappcar(c2);
			
			swapper(sw1, sw2);
			
			System.out.println("after swap :");
			System.out.println("c1's information : "+sw1.c.toSting());
			System.out.println("c2's information : "+sw2.c.toSting());
			
			
		}
	
}
