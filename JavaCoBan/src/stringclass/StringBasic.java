package stringclass;

import java.util.Locale;

public class StringBasic {
	
	// link :https://www.tutorialspoint.com/java/java_strings.htm

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="d";
		char []a= {'a','b','c'};
		String  str2=new String(a);
		System.out.println(str1);
		System.out.println(str2);
		// length method
		
		System.out.println("lenght of str1 = "+str1.length());
		
		//public String concat(String str)  ; noi 2 chuoi
		
		System.out.println(str1.concat(str2));
		System.out.println("chuoi1".concat("chuoi2"));
		String str3=str1+str2;
		System.out.println(str3);
		
		
		//String's static format() method
		System.out.printf("value = %d\n",9); // moi lan in p viet 1 lan 
		
		String str4=String.format("value = %d\n",9);  // tao 1 dinh dang string , co the sung nhieu lan
		System.out.println(str4);
		
		//public int compareTo(String anotherString)
		
		if(str1.compareTo(str2)==0)
		{
			System.out.println("2 chuoi nhu nhau !");
		}
		else if(str1.compareTo(str2)<0)
		{
			System.out.println("str1 < str2 !");
		}
		else System.out.println("str1 > str2 !");
		
		// public boolean contains(CharSequence s)
		System.out.println("1221".contains("12"));  // in ra true vi "12" la chuoi con cua chuoi"1221"
		
		
		//public static String copyValueOf(char[] data)
		char []c= {'1','2','3','4','5','6'};
		String str5=String.copyValueOf(c);  // tra ve 1 chuoi string tu mot mang qua ham coppyvalueof()
		System.out.println("str5 = "+str5);
		String str6=String.copyValueOf(c, 1, 4); // ham tra ve 1 chuoi string tu c[1] va co do dai 4 phan tu 
		System.out.println("str6= " + str6);
		
		//public boolean endsWith(String suffix)
		String str7="huy123",str8="123";
		
		if(str7.endsWith(str8)==true) System.out.println("str8 la duoi cua str 7");
		else System.out.println("str8 k p la duoi cua str7 ");
		
		//public boolean equalsIgnoreCase(String anotherString)    so sanh 2 string k phan biet chu in chu tg , bang nhau thi la true , con lai la flase
		String str9="huy",str10="HUY";
		if(str9.equalsIgnoreCase(str10)== true )
			System.out.println("str9 = str10");
		else System.out.println("str9 != str 10");
		
		
		//public byte[] getBytes()  
		String str11="ABC";
		byte []c11=str11.getBytes();  // tao mang byte , co do dai bang voi do dai cua chuoi str22, moi phan tu cua mang byte nay chua ma assci cua tung ki tu trong str11
	    System.out.println(c11[0]);  // in ma assci cua tung chu cai trong str1 
	    System.out.println(c11[1]);
	    System.out.println(c11[2]);
	    
		String str12=new String(str11); // tao 1 chuoi moi tu mang byte c11;
		System.out.println(str12);
		String str13=new String(new byte[] {65,65,65}); // neu thi cx co the dung ham tao string nay de tao chuoi tu mang byte , moi phan tu la ma assci cua 1 ki tu 
		System.out.println(str13);
		
		
		//public int hashCode()  :https://www.tutorialspoint.com/java/lang/string_hashcode.htm
		
		//public int indexOf(int ch)  : tra ve chi so cua ki tu dau co ma asci la ch , xuat hien trong chuoi, neu k tim thay thi ham tre ve -1
		String str14="ABPACpAD";
		System.out.println("chi so cua A trong str14 : "+str14.indexOf(65));
		
		//public int indexOf(int ch, int fromIndex)  : tg tu ham ben tren , chi khac la luk nay vc tim kiem bat dau tu chi so fromindex tro ve cuoi chuoi , tra ve chi so neu tim thay , neu k thay thi tra ve -1
		System.out.println("chi so cua A trong str14 , tim kiem tu str14[1] : "+str14.indexOf(65, 1));
	    
		//public int lastIndexOf(int ch)
		System.out.println("chi so cua A xuat hien cuoi cung trong chuoi str14 la : "+str14.lastIndexOf(65));
		
		//public int lastIndexOf(int ch, int fromIndex) 
		System.out.println("chi so cua A xuat hien cuoi cung trong chuoi str14 , khi bat dau tim kiem nguoc tu str14[3]  la :" + str14.lastIndexOf(65,3));
	
		//public String intern()  :https://www.tutorialspoint.com/java/lang/string_intern.htm
		
		//public boolean isEmpty()  :This method returns true if length() is 0, else false.
		
		// public boolean matches(String regex)  : true khi bieu thu chinh quy regex khop voi chuoi goi ham nay
		// bieu thuc chinh quy : https://o7planning.org/vi/10175/huong-dan-su-dung-bieu-thuc-chinh-quy-trong-java
		if("h".matches("[a-z]")==true ) System.out.println(" Khop (matches)");
		else System.out.println("khong khop (don't match)");
		//public String replace(char oldChar, char newChar)  : thay the tat ca chuoi oldChar thanh newChar
		String str16=str14.replace('A', 'B'); 
		System.out.println(str16);
		
		
		//public String replace(CharSequence target, CharSequence replacement)  : thay the chuoi con target thanh chuoi replacement, vc thay the nay thuc hien tu dau chuoi cho toi cuoi chuoi , lan luot.
		CharSequence str17="123";
		CharSequence str18="AB";
		String str19=str14.replace(str18, str17);
		System.out.println(str19);
		
		
		//public String replaceAll(String regex, String replacement) : thay the chuoi regex(bieu thu chinh quy)  co trong chuoi bang chuoi replacement , neu k tim dc chuoi regex thi se k thay doi j ca
		System.out.println(str14.replaceAll("A", "0"));
		
		
		//public String replaceFirst(String regex, String replacement) : thay the chuoi regex(bieu thu chinh quy) xuat hien dau tien trong chuoi bang chuoi replacement , neu k co thi k lam j , neu co nhieu chuoi regex thi chi thay the cai dau tien 
		System.out.println(str14.replaceFirst("A", "@@"));
		
		//public String[] split(String regex)  :  chia chuoi dua tren cac bieu thuc chinh quy lam tham so
		String []str21= "1-2-3-4-5".split("[0-9]"); // bieu thuc chinh quy la[0-9] tu la khop voi voi cac so tu 0-9, xet tung phan tu trong chuoi neu la cac so tu 0-9 thi bi loai ra , chi de lai cac ki tu k p la so 0-9 trong cac mang string
		for(String b : str21)
		{
			System.out.println(b);
		}
		
		
		//public String[] split(String regex, int limit)  : cach tach cx nhu ham ben tren , khac la n tach tu dau toi khi nao mang ket qua du limit phan tu thi dung 
		String []str22="1-2-3-4-5".split("-",3);
		for(String b : str22)
		{
			System.out.println(b);
		}
		
		
		//public boolean startsWith(String prefix) : true neu chuoi bat dau bang chuoi con prefix neu k thi false
		String str23="www.facebook.com";
		System.out.println( "start with  www ? : "+ str23.startsWith("www"));
		System.out.println("start with   http ? :"+str23.startsWith("http"));
		
		
		//public boolean startsWith(String prefix, int offset) : cx kiem tra nhu ham ben tren nhg xet tu ki tu co chi so la offset trong chuoi
		
		
		
		//public String substring(int beginIndex) : tra ve chuoi con tu chuoi hien tai , bat dau tu ki tu co chi so la beginindex toi cuoi chuoi
		String str24="123456789".substring(3);
		System.out.println(str24);
		
		//public String substring(int beginIndex, int endIndex) : tg tu nhu tren , nhg ham nay tra ve chuoi con tu ki tu co chi so beginindex toi endindex(k lay ki tu co chi so la endindex)
		System.out.println("01234567".substring(0, 4));
		
		
		//public char[] toCharArray()   :  method converts this string to a new character array.
		char []ch="012345678".toCharArray();
		for(char b : ch)
		{
			System.out.println(b);
		}
		
		//public String toLowerCase() 
		System.out.println("HUYhuy".toLowerCase());
		
		//public String toUpperCase()
		System.out.println("huyhuy".toUpperCase());
		
		//public String trim()  : tra ve ban sao cua chuoi va bo di khoang trang o dau va o cuoi neu co 
		System.out.println("\n\nhuy\n\n".trim());
		
		
		
		
			
	}

}
