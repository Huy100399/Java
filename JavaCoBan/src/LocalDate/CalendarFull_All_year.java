package LocalDate;

import java.time.LocalDate;
import java.util.Scanner;


// hien lich cua bat ki mot nam nao do nhap vao

public class CalendarFull_All_year {

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("nhap nam ma ban muon xem lich !!!");
			
			n=(new Scanner(System.in)).nextInt();
			
		} while(n<=1970);
		
		System.out.println("NAM "+n);
		
		LocalDate date0=LocalDate.now().minusYears(LocalDate.now().getYear()-n);
		
		for(int h=1;h<=12;h++)
		{
			System.out.println("\n");
			LocalDate date=date0.minusMonths(date0.getMonthValue()-h);
			
			System.out.println("thang "+date.getMonthValue()+"\n");
			
		    LocalDate date1=date.minusDays(date.getDayOfMonth()-1);
		    
		    System.out.print("thu2    thu3    thu4    thu5    thu6    thu7    thu8\n");
		    
		    for(int i=1;i<date1.getDayOfWeek().getValue();i++)
		    {
		    	System.out.print("        ");
		    }
		    int count=date1.getDayOfWeek().getValue();
			for(int i=1;i<=date.lengthOfMonth();i++)
			{
				
				if(count%7==0)
				{
					
					if(i==LocalDate.now().getDayOfMonth() && date0.getMonthValue()==LocalDate.now().getMonthValue() && date0.getYear()==LocalDate.now().getYear()) System.out.printf("%3d*\n",i);
					else System.out.printf("%4d    \n",i);
				}	
				
				else 
				{
					
					if(i==LocalDate.now().getDayOfMonth() && date0.getMonthValue()==LocalDate.now().getMonthValue() && date0.getYear()==LocalDate.now().getYear()) System.out.printf("%3d*    ",i);
					else System.out.printf("%4d    ",i);
				}
				count++;
			}
		}
	}
}
