
public class Euler_15 {
	
	public static long pascalSolve(int n, int k)
	{
		/* 		https://en.wikipedia.org/wiki/Pascal%27s_triangle
		 * 		n is the number of moves,
		 * 		k is the number of down and right moves */
 
		if (k > (n-k))
			k = n - k;
		
		long c = 1;
		
		for (int i = 0; i < k; i++)
		{
			c = c * (n-i);
			c = c / (i+1);			
		}
		
		return c;
	}
	
	public static void main (String[] args)
	{
		System.out.println(pascalSolve(40,20));
	}
}
