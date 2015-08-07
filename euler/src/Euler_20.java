import java.math.BigInteger;



public class Euler_20
{
	public static void main(String args[])
	{
		int x;
		BigInteger y= new BigInteger("100");
		
		
		for(x=99;x>0;x--)
		{
			BigInteger bigInt = new BigInteger(String.valueOf(x));
			y = y.multiply(bigInt);
		}
		
		int z = 0;
		String num = y.toString();
		int sum = 0;
		//System.out.println(num);
	    //	System.out.println(num.length());
		
		String[] strArray = num.split("");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < num.length(); i++) {
			sum += Integer.parseInt(String.valueOf(num.charAt(i)));
		} 
		System.out.println(sum);
	}

}
