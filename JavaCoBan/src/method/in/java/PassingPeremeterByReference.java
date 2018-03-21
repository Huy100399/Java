package method.in.java;

public class PassingPeremeterByReference {
	
	
	 public static class MyInteger
	  {
	    public int value;

	    public MyInteger(int number)
	    {
	      this.value = number;
	    }
	  }

	  public static void main(String[] args)
	  {
	    MyInteger obj1, obj2, obj3;
	    

	    System.out.println("[1] Create some new MyInteger objects...");

	    obj1 = new MyInteger(9);
	    System.out.println("obj1 = new  -> obj1 value: " + obj1.value);

	    obj2 = new MyInteger(8);
	    System.out.println("obj2 = new  -> obj2 value: " + obj2.value);

	    obj3 = new MyInteger(7);
	    System.out.println("obj3 = new  -> obj3 value: " + obj3.value);

	    System.out.println("");

	    System.out.println("[2] Now lets assign some of them to another object...");

	    obj3 = obj2;
	    System.out.println("obj3 = obj2 -> obj3 value: " + obj3.value);

	    obj2 = obj1;
	    System.out.println("obj2 = obj1 -> obj2 value: " + obj2.value);

	    System.out.println("");

	    System.out.println("[3] So, if obj3 = obj2 and obj2 = obj1, what is the value of obj3?");

	    System.out.println("obj3        -> obj3 value: " + obj3.value);

	    System.out.println("");

	    System.out.println("[4] Lets assign to obj1 value the number 1...");

	    obj1.value = 1;
	    System.out.println("obj1        -> obj1 value: " + obj1.value);

	    System.out.println("");

	    System.out.println("[5] So, if obj2 = obj1, what is the value of obj2?");
 
	    System.out.println("obj2        -> obj2 value: " + obj2.value);

	    System.out.println("");

	    System.out.println("[6] end.");
	  
	  }

}
