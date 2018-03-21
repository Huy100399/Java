package numberclass;

import org.omg.CORBA.MARSHAL;

public class NumberMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Integer a=9; // hoac Integer a=9;
			Integer c=10,d=9;
			Double e=9.09;
			
			
			System.out.println(a.intValue());
			System.out.println(a.doubleValue());
			System.out.println(a.toString());
			System.out.println(a.intValue()+9);
			System.out.println("\n\n");
			
			// ham compare cho so sanh 2 doi tg so cun kieu
			System.out.println(c.compareTo(d)); 
			System.out.println(a.compareTo(0));
			System.out.println(e.compareTo(9.0));
			System.out.println("\n\n");
			
			// ham equals co the so sang 2 kieu doi tg so bat ki voi nhau 
			System.out.println(a.equals(9)); 
			System.out.println(a.equals(c));
			System.out.println(a.equals(e));
			System.out.println("\n\n");
			
			//valueOf()
			
			//static Integer valueOf(int i)  tra ve 1 doi tuong Integer sao cho gia tri cua doi tg nay bang voi gia tri cua  bien int truyen vao
			Integer val=Integer.valueOf(9);  // tao ra doi tg val co gia tri la 9
			System.out.println(val);
			System.out.println(val.intValue());
			System.out.println(val.floatValue());
			System.out.println("\n\n");
			//static Integer valueOf(String s)  : tra va doi tg Integer sao cho gia tri cua doi tg moi nay bang voi String trng phan doi so(string trong phan doi so phai la so nguyen)
			Integer val1=Integer.valueOf("9");
			System.out.println(val1);
			System.out.println(val1.valueOf("99"));
			System.out.println(Integer.valueOf("999"));
			//static Integer valueOf(String s, int radix) // tra ve mot doi tg Integer ma gia tri cua n bang voi gia tri cua chuoi trong phan doi so(string trong phan doi so phai la so nguyen),radix ching la co so
			Integer val2 = Integer.valueOf("10",2);  // tra ve doi tg Integer sao cho bien nay co dang he co so 2 la 10
			System.out.println(val2);
			System.out.println(Integer.valueOf("19221",16)); // tra ve doi tg Integer sao cho bien nay co dang he co so 16 la 19221
			System.out.println(Integer.valueOf("AB",16));   // tra ve doi tg Integer sao cho bien nay co dang he co so 16 la AB
			System.out.println("\n\n");
			
			
			//toString()
			Integer val3=10;
			Double val4=9.0;
			System.out.println("chuoi bieu dien gia tri cua val3 :"+val3.toString());
			System.out.println("chuoi bieu dien gia tri cua val4 :"+val4);
			System.out.println("chouoi bieu dien cua val3 sau khi chuyen tu he 2 sang he 10 (integer)"+val3.toString(2));
			System.out.println("\n\n");
			
			//parseInt() 
			
			System.out.println(Integer.parseInt("99")); //chuyen 99 tu dang string sang Integer va in ra  , 
			System.out.println(Integer.parseInt("99",16));  // chuyen 99 tu dang integer he 16 sang he 10 va in ra
			System.out.println("\n\n");
			
			System.out.println(Math.toDegrees(Math.atan2(2, 2)));
			
	}

}
