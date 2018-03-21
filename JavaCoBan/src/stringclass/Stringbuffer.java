package stringclass;


//link : https://www.tutorialspoint.com/java/lang/java_lang_stringbuffer.htm


public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer str1=new StringBuffer();
		System.out.println("str1 capacity : "+str1.capacity());
		System.out.println("str1 lenght : "+str1.length());
		System.out.println("str1 : "+str1 );
		//public StringBuffer append(boolean b) 
		str1.append(true);
		System.out.println("str1 : "+str1);
		str1.append(false);
		System.out.println("str1 :"+ str1);
		
		// public StringBuffer append(char c) 
		str1.append('A');
		System.out.println("str1 : "+str1);

		//public StringBuffer append(char[] str) 
		str1.append(new char[]{'a','b','c'});
		System.out.println("str1 : "+str1);
		
		
		//public StringBuffer append(char[] str, int offset, int len) : noi lan luot cac ki tu cua mang char tu phan tu co chi so offse , noi lan luot cho toi khi du len ki tu 
		StringBuffer str2=new StringBuffer("123");
		char []ch2= {'0','1','2','3','4','5','6'};
		str2.append(ch2,0,3);
		System.out.println("str2 : "+str2);
		System.out.println("str2.lenght = "+str2.length());
		
		
		//public StringBuffer append(CharSequence s)
		CharSequence ch3="01234";
		str2.append(ch3);
		System.out.println("str2 : "+str2);
		System.out.println("str2.lenght : "+str2.length());
		
		//public StringBuffer append(CharSequence s, int start, int end) 
		StringBuffer str4=new StringBuffer("123");
		CharSequence ch4="0123456";
		str4.append(ch4,0,4);
		System.out.println("str4 : "+str4);
		System.out.println("str4.lenght : "+str4.length());
		
		
		//public StringBuffer append(String str)  : noi chuoi str theo thu tu vao sau chuoi stringbuffer dang goi ham , neu str la null thi 4 ki tu null se dc noi vao
		String str5=null;
		str4.append(str5);
		System.out.println("str4 : "+str4);
		System.out.println("str4.lenght : "+str4.length());
		
		
		//public StringBuffer append(StringBuffer sb) 
		
		str4.append(new StringBuffer("HUY"));
		System.out.println("str4 : "+str4);
		System.out.println("str4.lenght : "+str4.length());
		
		//public StringBuffer appendCodePoint(int codePoint) : noi ki tu co ma assci la codepoint vao cuoi cuoi stringbuffer goi ham 
		str4.appendCodePoint(65);
		System.out.println("str4 : "+str4);
		System.out.println("str4.lenght : "+str4.length());
		
		
		//public int capacity() : tra ve suc chua cua chuoi , hay noi cach khac la vung nho dc cap phat cho chuoi, k nhat thiet la p bang voi do dai chua chuoi
		StringBuffer str6=new StringBuffer("123456789112233499");
		System.out.println("str6.capacity : "+str6.capacity());
		str6.append("");
		System.out.println("str6.capacity : "+str6.capacity());
		
		
		//public char charAt(int index)  
		
		System.out.println("str6[1] = "+str6.charAt(1));
		
		//public int codePointAt(int index) : tra ve ma assci cua ki tu co chi so la index trong chuoi
		System.out.println("str6[1]  assci : "+str6.codePointAt(1));
		
		//public int codePointBefore(int index) : trar ve ma assci cua ki tu trk ki tu co chi so la index
		System.out.println("str6[0] assci : "+str6.codePointBefore(1));
		
		//public StringBuffer delete(int start, int end)  
		StringBuffer str7=new StringBuffer("01234567");
		str7.delete(0, 3);  // xoa tu str7[0] toi str7[2];
		System.out.println("str7 : "+str7);
		str7.delete(1,1);  // neu start = end thi k co j xay ra ca
		System.out.println("str7 : "+str7);
		
		//public StringBuffer deleteCharAt(int index)  : // xoa ki tu co chi so la index trong chuoi
		StringBuffer str8=new StringBuffer("01234");
		str8.deleteCharAt(2);  // xoa str8[2]
		System.out.println("str8 : "+str8);
		
		//public void ensureCapacity(int minimumCapacity) 
		StringBuffer str9=new StringBuffer("012");
		System.out.println("old str9 capscity : "+str9.capacity());
		str9.ensureCapacity(29);  // neu doi so > old capacity thi capacity moi se bang 2 lan old capacity +2
		System.out.println("new str9 capacity : "+str9.capacity());
		StringBuffer str10=new StringBuffer("012");
		System.out.println("old str10 capacity : "+str10.capacity());
		str10.ensureCapacity(18); // neu doi so nho hon old capacity thi new capacity bang old capacity
		System.out.println("new str10 capacity : "+str10.capacity());
		
		//public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)  : noi cac ki tu thu str[srcbegin] toi str[srcend-1] vao mang dst tu phan tu dst[dstbegin]
		StringBuffer str11=new StringBuffer("01234567");// cac phan tu khac cua mang cha thi giu nguyen 
		char []ch11= {'h','u','y','h','u','y','i','i','o'};
		for(char b : ch11)
		{
			System.out.print(b);
		}
		System.out.println("\n old ch11.lenght : "+ch11.length);
		str11.getChars(1, 4, ch11, 3);
		for(char b : ch11)
		{
			System.out.print(b);
		}
		System.out.println("\n new ch11.lenght : "+ch11.length);
		
		
		//public int indexOf(String str) : neu str la chuoi con cua chuoi goij phuong thuc nay thi phuong thuc se tra ve chi so cua ki tu dau tien cua chuoi str va o lan xuat hien dau tien cua chuoi str , neu str k p la chuoi con  thi tra ve -1
		System.out.println("index of 'huy' in str8 : "+ str8.indexOf("huy"));
		System.out.println("index of '012' in str11 : "+str11.indexOf("012"));
		
		
		//public int indexOf(String str, int fromIndex)  : tg tu nhu tren nhg co them cho so bat dau tim kiem la tu fromindex
		
		//public StringBuffer insert(int offset, boolean b) 
		StringBuffer str12=new StringBuffer("01234");
		System.out.println("old str12 : "+str12);
		str12.insert(1, true);
		System.out.println("new str12 : "+str12);
		
		//public StringBuffer insert(int offset, char c) 
		str12.insert(0, 'H');
		System.out.println("str12 : "+str12);
		
		//public StringBuffer insert(int offset, char[] str) 
		str12.insert(0, new char [] {'h','u','y'});
		System.out.println("str12 : "+str12);
		
		//public StringBuffer insert(int index, char[] str, int offset, int len) : chen str[offset] toi str[len-1]  vao chuoi goi phuong thuc nay tu ki tu co chi so la index
		
		
		//public StringBuffer insert(int dstOffset, CharSequence s) 
		
		// public StringBuffer insert(int dstOffset, CharSequence s, int start, int end)
		
		//public StringBuffer insert(int offset, double d)    co the thay long = int , float ,...
		
		//public StringBuffer insert(int offset, Object obj) 
		
		//public StringBuffer insert(int offset, String str) 
		
		
		//public int lastIndexOf(String str) : tra ve chi so cua str[0] o lan xuat hien cuoi cung cua str ben trong chuoi goi phuong thuc , neu str l xuat hien trong chuoi goi phuong thuc thi trar ve -1
		StringBuffer str13=new StringBuffer("huy123huy");
		System.out.println("last index of 'huy' in str13 : "+str13.lastIndexOf("huy"));
		
		//public StringBuffer replace(int start, int end, String str) 
		
		str13.replace(2,4, "000");
		System.out.println("str13 : "+str13);
		
		//public StringBuffer reverse() : doi co cac ki tu trong chuoi
		
		StringBuffer str14=new StringBuffer("12345");
		str14.reverse();
		System.out.println("str14 : "+str14);
		
		
		//public void setCharAt(int index, char ch) : thiet lap lai ki tu chi si so la index , thay doi ki tu do thanh ch
		StringBuffer str15=new StringBuffer("012345");
		System.out.println("str15 : "+str15);
		str15.setCharAt(2, 'H');
		System.out.println("str15 : "+str15);
		
		//public void setLength(int newLength)  : thiet lap lai do dau , neu newlenght > oldlenght thi cac ki tu null se dc them vao sao cho bang voi newlenght , con neu nguoc lai thi chuoi se bi cat bot di 
		StringBuffer str16=new StringBuffer("0123456");
		str16.setLength(10);
		System.out.println("str16 : "+str16);
		System.out.println("str16.lenght : "+str16.length());
		str16.setLength(4);
		System.out.println("str16 : "+str16);
		System.out.println("str16.lenght : "+str16.length());
		
		//public String substring(int start) 
		//public String substring(int start, int end) 
		//public String toString() : tra ve chuoi giong y het nhg kieu la string 
		
		
		//public void trimToSize()  : xoa bot phan capacity k dung toi cua chuoi , sau ham nay thi capacity = lenght= so ki tu cua chuoi
		StringBuffer str17= new StringBuffer("huy");
		System.out.println("Str17 : "+str17);
		System.out.println("old capacity str17 : "+str17.capacity());
		str17.trimToSize();
		System.out.println("Str17 : "+str17);
		System.out.println("new capacity str17 : "+str17.capacity());
		
		//public int offsetByCodePoints(int index, int codePointOffset)  
		StringBuffer str18= new StringBuffer("ABC");
		System.out.println(str18.offsetByCodePoints(1, 2));
		
		
	}
}
