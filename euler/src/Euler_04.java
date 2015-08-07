
public class Euler_04 
{
	public static void main(String args[])
	{
		int x,j=0,z=0,k=0;
		
		for(x=0; x<101; x++)
		{
			j=j+x;
		}
		j=j*j;
		System.out.println(j);
		
		for(x=0; x<101; x++)
		{
			z=x*x;
			k=k+z;
		}
		System.out.println(k);
		
		System.out.println(j-k);
	}
}
