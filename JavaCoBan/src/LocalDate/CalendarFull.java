package LocalDate;

import java.time.LocalDate;

public class CalendarFull {

	// hien lich cua ca nam hien tai 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LocalDate date0=LocalDate.now();
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
			
			if(i==date0.getDayOfMonth() && date.getMonthValue()==date0.getMonthValue()) System.out.printf("%3d*\n",i);
			else System.out.printf("%4d    \n",i);
		}	
		
		else 
		{
			
			if(i==date0.getDayOfMonth() && date.getMonthValue()==date0.getMonthValue()) System.out.printf("%3d*    ",i);
			else System.out.printf("%4d    ",i);
		}
		count++;
	}
}

	}

}


