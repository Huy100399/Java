package stringclass;

// https://www.tutorialspoint.com/java/lang/java_lang_stringbuilder.htm

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor 
		//StringBuilder()  ,StringBuilder(CharSequence seq) ,StringBuilder(int capacity),StringBuilder(String str)
		
		StringBuilder str1=new StringBuilder("huy");
		str1.insert(1, 'r');
		System.out.println(str1);
		
	}

}
