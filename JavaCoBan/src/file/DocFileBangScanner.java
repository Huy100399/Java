package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javax.xml.transform.Source;

import com.sun.org.apache.xpath.internal.SourceTree;

public class DocFileBangScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("/root/eclipse-workspace/JavaCoBan/file1.txt");
		RandomAccessFile ranf= new RandomAccessFile(file,"rw");
		Scanner read = new Scanner(file);
		
		try
		{
			System.out.println(read.nextLine());
			
			System.out.println(read.hasNextLine());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("loi : "+e.getMessage());
		}
		
		
		
		// doc cac dong con lai 
		while(read.hasNextLine()!=false)
		{
			System.out.println(read.nextLine());
		}
		
		read.close();
		System.out.println("DOC SO TU FILE :");
		read = new Scanner(file);
		while(read.hasNextByte()==true)
		{
			System.out.println(read.nextInt());
		}
		
		
		
	}

}
;