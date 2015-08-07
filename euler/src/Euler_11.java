import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler_11
{
	public static void main(String args[])
	{
		File file = (new File("tall.txt"));
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int [] tall = new int [400];
		int i = 0;
		while(scanner.hasNextInt()){
		   tall[i++] = scanner.nextInt();
		}
		
		int maxSum = 0;
		int sum = 0;
		int [] digits = new int [4];
		
		for(int x = 0; x < 339; x ++){
		    maxSum = tall[x]*tall[x+20]*tall[x+40]*tall[x+60];
			if(maxSum>sum){
				sum = maxSum;
				System.out.println(tall[x]+" "+tall[x+20]+" "+tall[x+40]+" "+tall[x+60]);
			}
		}
		
		System.out.println("The largest number vertically is : ");
		System.out.println(sum);
		

		maxSum = 0;
		sum = 0;
		
		for(int x = 0; x < 396; x ++){
		    maxSum = tall[x]*tall[x+1]*tall[x+2]*tall[x+3];
			if(maxSum>sum){
				sum = maxSum;
				System.out.println(tall[x]+" "+tall[x+1]+" "+tall[x+2]+" "+tall[x+3]);
			}
		}
		
		System.out.println("The largest number horizontally is : ");
		System.out.println(sum);
		
		
		maxSum = 0;
		sum = 0;
		
		for(int x = 0; x < 336; x ++){
		    maxSum = tall[x]*tall[x+21]*tall[x+42]*tall[x+63];
			if(maxSum>sum){
				sum = maxSum;
				System.out.println(tall[x]+" "+tall[x+21]+" "+tall[x+42]+" "+tall[x+63]);
			}
		}
		
		System.out.println("The largest number diagonally is : ");
		System.out.println(sum);
		
		
		maxSum = 0;
		sum = 0;
		
		for(int x = 4; x < 340; x ++){
		    maxSum = tall[x]*tall[x+19]*tall[x+38]*tall[x+57];
			if(maxSum>sum){
				sum = maxSum;
				System.out.println(tall[x]+" "+tall[x+19]+" "+tall[x+38]+" "+tall[x+57]);
			}
		}
		
		System.out.println("The largest number diagonally2 is : ");
		System.out.println(sum);
		
	}

}
