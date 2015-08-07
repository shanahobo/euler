public class Euler_14
{
	public static void main(String args[])
	{
		int x;
		int counter = 0;
		int largest = 0;
		int chain = 0;
		
		for(x = 500000; x<1000000; x++){
			counter = collatz(x);
			if(counter > largest){
				largest = counter;
				chain = x;
			}
		}
		//counter = collatz(504057);
		System.out.println("the longest collatz chain comes from the number "+chain+" with a length of " + largest);
	}
	
	public static int collatz(long z){
		System.out.println(z);
		int count = 0;
		while(z!=1){
			if(z%2==0){
				z = z/2;
				count++;
			}
			else{
				z = z*3+1;
				count++;
			}	
		}
		return count;
		
	}
}
