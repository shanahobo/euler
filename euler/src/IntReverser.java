
public class IntReverser{
	
	int last_digit, reversedNum = 0;

	int reversed(int input)
	{
		while (input != 0)
		{    
			last_digit = input % 10;
			reversedNum = reversedNum * 10 + last_digit;
			input = input / 10; 
		}
		
		return reversedNum;
	}
}
