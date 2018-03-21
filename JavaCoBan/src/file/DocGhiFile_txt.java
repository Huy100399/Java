package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class DocGhiFile_txt {

	// link : https://www.tutorialspoint.com/java/io/java_io_printwriter.htm 
	// link : https://www.tutorialspoint.com/java/io/java_io_inputstream.htm 
	// https://www.tutorialspoint.com/java/java_files_io.htm
	
	
	public static void main(String[] args) throws IOException {
		
		//DOC FILE
		
		// TODO Auto-generated method stub

		// public abstract int read() : This method returns the next byte of data, or -1 if the end of the stream is reached.
		
		// public int available() : tra ve so byte ki tu co the doc tu file , neu con tro dang o cuoi file thi se tra ve 0
		
		File f= new File("C:\\Users\\Administrator\\Desktop\\f.txt");
		if(f.exists()==false )
			f.createNewFile();
		
		InputStream in= new FileInputStream(f);
		
		int i;
		System.out.println("all bytes can read in f :"+in.available());
		System.out.println("f's content : ");
		while((i=in.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
		// public void close() : dong stream goi ham , sau khi dung ham nay thi k the thao tac den stream goi ham nay nua
		
		
		
		/*
		 in.close();
		
		System.out.println(in.read());
		
		 neu nhu sau khi dong ma van thao tac den stream in nhu nay thi se gay ra loi
		*/
		
		
		// public int read(byte[] b) : doc b.lenght byte tu trong file , va luu vao mang b
		
		//in.mark(0);
		
		File f1= new File("C:\\Users\\Administrator\\Desktop\\f1.txt");
		if (f1.exists()== false) f1.createNewFile();
		InputStream in1= new FileInputStream(f1);
		System.out.println("f1's content : ");
		byte[] buffer = new byte[2];
		
		 in1.read(buffer);
		 
		 for(int a : buffer)
		 {
			 System.out.print((char) a);
		 }
		
		 
		 
		 // public int read(byte[] b, int off, int len)  : doc len ki tu tu file va luu vao mang b tu phan tu b[off]
		 
		 
		 InputStream in2= new FileInputStream(f1);
		 byte []buffer2= new byte[10];
		 
		 in2.read(buffer2, 4, 5);
			System.out.println();
		 for(int b : buffer2)
		 {
			 if(b!=0)
				 System.out.print((char)b);
			 else System.out.print("-");
				 
		 }
		 
		 // public long skip(long n) : bo qua n byte  doc  
		 
		 System.out.println();
		 
		 InputStream in3= new FileInputStream(f1);
		 int c;
		 while((c=in3.read())!=-1)
		 {
			 if(in3.available()==3) in3.skip(2); 
			  System.out.print((char)c);
		 }
		 
		 
		 
		// GHI FILE
		 
		// public void close() 
		 
		// public void write(byte[] b) : ghi mang byte b vao file 
		 
		 OutputStream out= new FileOutputStream(f1);
		 
		 byte []b= {'h','u','y',65};
		 
		 out.write(b);
		 System.out.println();
		 InputStream in4= new FileInputStream(f1);
		 int d;
		 while((c=in4.read())!=-1)
		 {
			 
			  System.out.print((char)c);
		 }
		 
		 
		 // public void write(byte[] b, int off, int len) : ghi cac byte tu b[off] toi b[b+len-1] o dang ki tu 
		 
		 byte []b1= {'h','u',(char)65};
		 File f2= new File("C:\\Users\\Administrator\\Desktop\\test.txt");
		 f2.createNewFile();
		 OutputStream out1= new FileOutputStream(f2);
		 out1.write(b1,1, 2);
		 
		 // public abstract void write(int b) : ghi (char) b vao file
		 
		 out1.write(65);
	
		 
		 //  @@@  Java.io.PrintWriter Class  @@@
		 
		 // ghi file : http://www.baeldung.com/java-write-to-file 
		 
		 
		
}
}
