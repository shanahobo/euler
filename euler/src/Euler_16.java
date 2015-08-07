import java.math.BigInteger;


public class Euler_16 {
	
	
	public static void main(String[]args){
		
		int x;
		BigInteger y = new BigInteger("2");
		BigInteger result = new BigInteger("2");
		
		
		for(x = 1; x <1000; x++){
			
			result = result.multiply(y);
		}
		
		System.out.println(result);
		
		int sum = 0;
		String str = result.toString();
		
		
		String[] strArray = str.split("");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		} 
		System.out.println(sum);
	}

}
