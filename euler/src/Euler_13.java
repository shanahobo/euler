import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler_13 {

	public static void main(String args[]) {

		String [] numbers = readFile();
		BigInteger sum= BigInteger.ZERO;
		
		for(int x = 0; x<numbers.length; x++)
		{
			sum= sum.add(new BigInteger(numbers[x]));
		}
		System.out.println(sum);
	}

	public static String[] readFile() {

		BufferedReader scanner;
		String number;
		List<String> lines = new ArrayList<String>();

		try {
			scanner = new BufferedReader(new FileReader("fifty.txt"));
			while ((number = scanner.readLine()) != null) {

				lines.add(number);

			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("Could not open file");
		}

		return lines.toArray(new String[lines.size()]);

	}

}