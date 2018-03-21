package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

 //https://www.tutorialspoint.com/java/io/java_io_file.htm
public class FileBasic{
	
	
	public static void main(String[] args) throws IOException {
		
		// tao file txt huy ngoai man hinh
		//File(String pathname)	 :  It creates a new File instance by converting the given pathname 
        //tring into an abstract pathname.
		
		//public boolean createNewFile() 
		File f= new File("C:\\Users\\Administrator\\Desktop\\huy.txt");  
		f.createNewFile();
		
		
		//File(File parent, String child) :	It creates a new File instance from a parent abstract
		//pathname and a child pathname string.
		
		
		//public boolean canExecute() 
		
		System.out.println("huy.txt is allowed to be executed by the application ?\n "+ f.canExecute());
		
		//public boolean canRead() 
		
		System.out.println("huy.txt  is allowed to be read by the application ? \n"+f.canRead());
		
		//public boolean canWrite() 
		
		System.out.println("the application to write to  huy.txt ?\n"+f.canWrite());
		
		//public int compareTo(File pathname) 
		
		// public static File createTempFile(String prefix, String suffix) : tao file voi tien to la prefix va hau to la subfix
		
		File f1= null;
		
		f1=File.createTempFile("huy1", "txt");
		
		System.out.println("pathname of f1 :"+f1.getAbsolutePath());
		
		//public boolean delete()
		
		boolean dele=	f.delete();
		System.out.println("f is successfully deleted ?"+dele);
		
		//public void deleteOnExit()
		
		/*method deletes the file or directory defined by the abstract path name when
		 *  the virtual machine terminates. Files or directories are deleted in the
		 *  reverse order as they are registered.*/
		
		//public boolean equals(Object obj)
		
		// public boolean exists()
		
		System.out.println("file exists :"+f1.exists());
		
		if( f1.exists()==true) System.out.println("deleted invoked !");
		else System.out.println("deleted didn't invoked !");
		
		System.out.println("file exists : "+f1.exists());
		
		//public File getAbsoluteFile() : The method returns the same file defined by the absolute abstract pathname
		// tra ve file tuong tu cai file hien tai dang goi ham , haay noi cach khac 2 file nay la 1
		
		File f3= new File("C:\\Users\\Administrator\\Desktop\\getfile.txt");
		f3.createNewFile();
		System.out.println("f3 exists ? :"+f3.exists());
		System.out.println("f3's pathname :"+ f3.getAbsolutePath());
		File f4= f3.getAbsoluteFile();
		System.out.println("f4 exists ? :"+f4.exists());
		System.out.println("f4's pathname :"+f4.getAbsolutePath() );
		f4.delete(); 
		System.out.println("deleted invoked !");
		System.out.println(" after delete f4 , f3 exists : "+ f3.exists()+"\nf4 exists : "+f4.exists());
		
		
		//public String getAbsolutePath()  : tra ve duong dan tuyet doi cua file 
		File f5=new File("test.txt"); // tao mac dinh or co the tao nhu cac lan tao o tren 
		f5.createNewFile();
		System.out.println("f5's absolute pathname : "+f5.getAbsolutePath());
		
		// public File getCanonicalFile() : The method returns same file or directory represented by the canonical pathname string.
		
		
		// public String getCanonicalPath() : tra ve ten duong dan nhg xoa di nhg phan ruom ra , nhu ' . '  ' .. ' ...
		File f6= new File("C:\\Users\\Administrator\\Desktop\\..\\test1.txt");
		
		f6.createNewFile();
		System.out.println("f6's absolute patfname : "+ f6.getAbsolutePath());
		System.out.println("f6's canonical pathname :"+f6.getCanonicalPath());
		
		f6.delete();
		
		//public long getFreeSpace() 
		File f7= new File("C:\\Users\\Administrator\\Desktop"); // f7 chinh la thu muc desktop 
		
		System.out.println("f7's pathname : "+f7.getAbsolutePath());  
		System.out.println("f7's unallocated :"+f7.getFreeSpace()+"bytes"); // hien thi freespcae cua desktop
		
		File f8= new File("C:\\Users\\Administrator\\Desktop\\f8.txt");
		f8.createNewFile();  
		System.out.println("f8's pathname : "+f8.getAbsolutePath());    
		System.out.println("f8's unallocated :"+f8.getFreeSpace()+"bytes");
	
		// freespace cua file f8 cx bang voi freespace cua desktop vi no deu la khong nho chua dung toi 
		
		
		
		//public String getName() : tra ve ten cua file , thu muc goi ham 
		
		System.out.println("f8's name :"+f8.getName());
		
		//public String getParent() : tra ve duong dan  thu muc cha neu co 
		
		System.out.println("f8's parent's pathname :"+f8.getParent());
		
		
		//public File getParentFile() : tra ve thu muc cha cua file goi ham
		
		
		
		//public String getPath() : tra ve chuoi duong dan cua file 
		
		System.out.println("f8's pathname :"+f8.getPath());
		
		// public long getTotalSpace() : tra ve kich thuc cua phan vung dat file 
		
		System.out.println("f8's total space :"+ f8.getTotalSpace());
		
		//public boolean isDirectory() : kiem tra xem doi tuong goi ham co la 1 thu muc hay k 
		
		System.out.println("f8 i directory :"+ f8.isDirectory());
		
		// public boolean isFile() : kiem tr xem doi tuong goi ham co lam 1 file hay k 
		
		System.out.println(" f8 is file :"+ f8.isFile());
		
		// public boolean isHidden() : kiem tra doi tuong goi ham co la hidden file hay k 
		
		// public long lastModified() : tra ve tg chinh sua cuoi cung , tra ve so day tu nam 1970
		
		System.out.println("f8 last modified :"+new Date(f8.lastModified()));
		
		// public long length() : tra ve kich thuoc dang byte cua file , k xac dih neu la thu muc
		
		System.out.println(" f8's lenght : "+f8.length());
		
		// public String[] list() : tr ve mang chua ten cac file , cac thu muc trong thu muc goi ham 
		
		System.out.println( " desktop's files: " );
		File f9= new File("C:\\Users\\Administrator\\Desktop");
		String [] list;
		list = f9.list();
		for(String s : list)
		{
			System.out.println(s);
		}
		
		// public String[] list(FilenameFilter filter) : tra ve ten cac file co trong thu muc goi ham , nhg co chon loc
		
		
		
		// public File[] listFiles() : tra ve mang cac  cac file trong thu muc goi ham 
		
		File [] f10;
		f10= f9.listFiles();
		System.out.println("all desktop's file :");
		for(File F : f10)
		{
			System.out.println(F.getAbsolutePath());
		}
		
		
		// public static File[] listRoots() : tr ve mang File chua cac thu muc o dia cua may tinh (cac thu muc roots)
		
		File []f11;
		f11=File.listRoots();
		System.out.println("all roots file of system : ");
		for(File FF : f11)
		{
			System.out.println(FF);
		}
		
		// public boolean mkdir() : tao  thu muc , co the dung nhieu dau \\ de tao cac thu muc cha con 
		
		File f12 = new File("C:\\Users\\Administrator\\Desktop\\f12\\d");
		
		boolean bool = f12.mkdirs();
		
		System.out.println("directory  created ? "+bool);
		
		
		// public boolean mkdirs() : tao thu muc , cx gan giong nhu ham mkdir
		
		File f13= new File("C:\\Users\\Administrator\\Desktop\\f13\\huy");
		f13.mkdirs();
		
		
		// public boolean renameTo(File dest)  : doi ten file goi ham thanh ten file cua file dest
		
		File dest= new File("C:\\Users\\Administrator\\Desktop\\f13ABC");
		boolean renamed=f13.renameTo(dest);
		
		System.out.println("f13 renamed succeeded :"+renamed);
		
		
		//public boolean setExecutable(boolean executable) 
		
		File f14 = new File("C:\\Users\\Administrator\\Desktop\\f14.txt");
		f14.createNewFile();
		System.out.println("before setExecutable:"+f14.canExecute());
		
		f14.setExecutable(false);
		
		System.out.println("after setExecutable:"+f14.canExecute());
		
		f14.delete();

		
		// public boolean setReadable(boolean readable) : thiet lap quyen doc cho file 
		
		File f15=  new File("C:\\Users\\Administrator\\Desktop\\f15.txt"); 
		
		f15.createNewFile();
		
		System.out.println("before setreadable :"+ f15.canRead());
		
		f15.setReadable(true);
		
		System.out.println("after setreadable :"+ f15.canRead());
		
		
		
		// public boolean setWritable(boolean writable) : thiet lap quyen ghi cho file
		System.out.println("before setwriteable :"+f15.canWrite());
		
		f15.setWritable(true);
		
		System.out.println("after setwriteable :"+f15.canWrite());
		
		// public String toString() : tra ve chuoi ten dg dan 
		
		
		
		
	}

	
}