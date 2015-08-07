
public class Euler_05 
{
	public static void main(String args[])
	{
		long x,j;
		int count = 0;
		
		for(j=2000; j<3000000000L; j++)
		{
			for(x=1; x<20; x++)
			{
				if(j%x==0)
				{
					count++;
				}
			}
			
			
			if(count>=19)
			{
				System.out.println(count);
				System.out.println(j);
				count = 0;
			}
			else
			{
				count = 0;
			}
		}
	}

}
