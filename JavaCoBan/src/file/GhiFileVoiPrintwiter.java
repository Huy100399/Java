package file;

// link : https://www.tutorialspoint.com/java/io/java_io_printwriter.htm 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Locale;

import javax.xml.transform.Source;

public class GhiFileVoiPrintwiter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1= new File("file1.txt");
		if (file1.exists()==false) file1.createNewFile();
		System.out.println("vi tri cua file1.txt :\n"+file1.getAbsolutePath());
		try(PrintWriter print1= new PrintWriter(file1))
		{
			//public PrintWriter append(char c) : noi ki tu c lien tiep vao cuoi file 
			
			print1.append('h');
			print1.append('u');
			
			// public PrintWriter append(CharSequence csq) : 
			
			CharSequence csq1= "ABCCD";
			print1.append(csq1);
			
			// public PrintWriter append(CharSequence csq,int start,int end) 
			
			// public void close()  : dong file 
			
			
			// public PrintWriter format(Locale l,String format,Object... args) 
			
			print1.format(Locale.CHINA,"huy %d tuoi ", 18);
			
			
			// public void print(char[] s) 
			
			char []c2= {'1','2','3'};
			print1.print(c2);
			
			// public void print(String s) 
			
			// public PrintWriter printf(String format,Object... args) 
			
			print1.printf("a= %f", 2.2);
			
			//public void write(char[] buf)
			
			
			
		}
		
		
		InputStream input= new FileInputStream(file1);
		
		char c1;
		int i1;
		System.out.println("noi dung file file 1 :");
		while((i1=input.read())!=-1)
		{
			System.out.print((char)i1);
		}

			
	}

}
