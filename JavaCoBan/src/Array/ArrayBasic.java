package Array;

import java.util.Scanner;

public class ArrayBasic {

	//The foreach Loops + Passing Arrays to Methods
	
	public static void print1(int []a)// dung foreach xuat mang 1 chieu 
	{
		for(int b :a )
			
		{
			System.out.println(b);
		}
	}
	
	
	
	
	//Returning an Array from a Method
	public static int[] input1(int n)
	{
		System.out.println("nhap mang : ");
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++)
			
		{
			System.out.println("nhap a["+i+"]=");
			
			a[i]=new Scanner(System.in).nextInt();
			
		}
		return a;
	}
	
	
	 public static int[][] input2(int m , int n)
	  
	  {
		  int [][]a=new int[m][n];
		  for(int i=0;i<m;i++)
			  
		  {
			  for(int j=0;j<n;j++)
			  {
				  System.out.println("enter value");
				  a[i][j]=new Scanner(System.in).nextInt();
			  }
		  }
		  
		  return a;
	  }
	  
	 
	// dung foreach xuat mang 2 chieu 
	  public static void print2(int[][] a)
	  {
		  for(int b[] : a)
		  {
			  for(int c : b)
			  {
				  System.out.println(c);
			  }
		  }
	  }
	  
	  
	// in mang 2 chieu theo cach thong thg
	 public static void print2_(int [][]a )
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 System.out.println(a[i][j]);
			 }
		 }
	 }
	  
	  
	 // nhap mang 3 chieu 
	 
	 public static int[][][] input3(int m,  int n , int k)
	 {
		 int [][][]a=new int[m][n][k];  // khoi tao mang co m mang 2 chieeu , moi mang 2 chieu thi lai co n mang 1 chieu ben trong no
		 for(int i=0;i<m  /*hoac i<a.lenght*/;i++)   
		 {
			 a[i]=input2(n,k);
		 }
		 return a;
	 }
	 
	 // in mang 3 chieu
	 
	 // cach 1 : dung foreach
	 public static void print3(int[][][]a)   
	 {
		for(int b[][] : a)
		{
			for(int c[] : b)
			{
				for(int d : c)
				{
					System.out.println(d);
				}
			}
		}
	 }
	 
	 // cach 2 dung cach thong thuong
	 
	 public static void print3_(int [][][]a)
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 for(int k=0;k<a[i][j].length;k++)
				 {
					 System.out.println(a[i][j][k]);
				 }
			 }
		 }
	 }
	
	// array sort 
	public static void sort1(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[i])
				{
					int dem=a[i];
					a[i]=a[j];
					a[j]=dem;
				}
			}
		}
		
	}
	
	
	
	//Binary Search Example in Java
	 public static void binarySearch(int arr[], int first, int last, int key){  
		 
		   int mid = (first + last)/2;  
		   
		   while( first <= last ){  
			   
		      if ( arr[mid] < key ){  
		    	  
		        first = mid + 1;     
		        
		      }else if ( arr[mid] == key ){  
		    	  
		        System.out.println("Element is found at index: " + mid);  
		        
		        break;  
		        
		      }else{  
		    	  
		         last = mid - 1;  
		         
		      }  
		      
		      mid = (first + last)/2;  
		      
		   }  
		   
		   if ( first > last ){  
			   
		      System.out.println("Element is not found!");  
		      
		   }  
		   
		 }  
	 
	 
	 
	 
	 
	 //Binary Search Example in Java using Recursion
	  public static int binarySearch1(int arr[], int first, int last, int key){  
		  
	        if (last>=first){  
	        	
	            int mid = first + (last - first)/2; 

	            if (arr[mid] == key){  
	            	
	            return mid;  
	            
	            }  
	            
	            if (arr[mid] > key){  
	            	
	            return binarySearch1(arr, first, mid-1, key);//search in left subarray 
	            
	            }else{  
	            	
	            return binarySearch1(arr, mid+1, last, key);//search in right subarray  
	            
	            }  
	            
	        }  
	        
	        return -1;  
	        
	    }  
	 
	  
	public static void main(String[] args) {
	
		int [][][]a;
		a=input3(1, 2, 2); // 1 mang 2 chieu  , moi  mang 2 chieu lai chua 2 mang 1 chieu con gom 2 phan tu , nen tong = 4 phan tu
		print3(a);
		System.out.println("\n\n");
		print3_(a);
	}
}
