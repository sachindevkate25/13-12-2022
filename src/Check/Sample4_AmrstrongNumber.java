package Check;

public class Sample4_AmrstrongNumber 
{
	public static void main(String[] args) 
	{
		
		
		int num=153;
		
		int sum=0;
		
		
		for(int i=num; i>0; i=i/10)
		{
			
			int rem=i%10;
			
			
			sum=sum+(rem*rem*rem);
				
		}
		
		
		if(num==sum)
		{
			System.out.println("Amrstrong Number");
		}
		else
		{
			System.out.println("Not Amrstrong Number");
		}
		
		
		
		
		
		
		
		
	}

}
