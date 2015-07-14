


/**

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

**/

class euler_17
{
	public static void main (String[] args)
	{
		int count = 0;
		
		String[] smallest = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		String[] odds = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		String[] hundreds = {"onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
		
		int oneToNinetyNine = countSmallest(smallest, odds, tens);
		
		count += oneToNinetyNine;
		
		for(int i = 0; i < hundreds.length; i++){
			count += hundreds[i].length();
			int hundCount = countHundreds(smallest, odds, tens, hundreds[i]);
			count += hundCount;
			
			count+= 297;
		}
		
		// add 1000
		count += 11;
		
		System.out.println(count);
		
		
		
	}
	
	static int countSmallest(String[] smallest, String[] odds, String[] tens){
		int count = 0;
		
		// 1-9
		
		for(int i = 0; i < smallest.length; i++){
			count += smallest[i].length();
		}
		
		// ten
		count += 3;
		
		// 11 -19
		for(int i = 0; i < odds.length; i++){
			count += odds[i].length(); 
		}
		
		// 20 - 99
		for(int i = 0; i < tens.length; i++){
			count += tens[i].length();
			
			for(int j = 0; j < smallest.length; j++){
				count += tens[i].length(); 
				count += smallest[j].length();
			}
		}

		return count;
	}
	
	
	
	static int countHundreds(String[] smallest, String[] odds, String[] tens, String hundred){
		int count = 0;
		
		// 1-9
		
		for(int i = 0; i < smallest.length; i++){
			count += hundred.length();
			count += smallest[i].length();
		}
		
		// ten
		count += hundred.length();
		count += 3;
		
		// 11 -19
		for(int i = 0; i < odds.length; i++){
			count += odds[i].length();
			count += hundred.length();
		}
		
		// 20 - 99
		for(int i = 0; i < tens.length; i++){
			count += tens[i].length();
			count += hundred.length();
			for(int j = 0; j < smallest.length; j++){
				count += tens[i].length(); 
				count += smallest[j].length();
				count += hundred.length();
			}
		}

		return count;
	}
}