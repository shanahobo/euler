
public class Euler_6 {
	
	public static void main(String args[])
	{
		int input, x,z;
		
		for(x=999998; x>800000; x--)
		{
			input = x;
			IntReverser reverser = new IntReverser();
			input = reverser.reversed(input);
			if(input==x)
			{
				for(z=999;z>700;z--)
				{
					if(input%z==0)
					{
						if(input/z<1000)
						{
							System.out.println(input);
							System.out.println(z);
						}
					}
				}
				
			}
		}
	}
	
}


