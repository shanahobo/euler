
public class Euler_7
{
	public static void main(String args[])
	{
		int x,z,i=1;
		
		for(x=2; x<120000; x++)
		{
			for(z=2; z<x; z++)
			{
				if(x%z==0)
				{
					break;
				}
				else
				{
					if(z==x-1)
					{
						i++;
						System.out.println(x+" "+i);
					}
				
				}
			}
		}
	}

}
