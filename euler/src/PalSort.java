import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import org.apache.commons.lang.StringUtils;

public class PalSort {

	static String[] list = {

	"A slut nixes sex in Tulsa.",
	"A tin mug for a jar of gum, Nita.",
	"A Toyota! Race fast, safe car! A Toyota!",
	"A Toyota’s a Toyota.",
	"Able was I ere I saw Elba.",
	"Acrobats stab orca.",
	"Aerate pet area.",
	"Ah, Satan sees Natasha!",
	"Aibohphobia (fear of palindromes)",
	"Air an aria.",
	"Al lets Della call Ed Stella.",
	"alula",
	"Amen icy cinema.",
	"Amore, Roma.",
	"Amy, must I jujitsu my ma?",
	"Ana",
	"Animal loots foliated detail of stool lamina.",
	"Anna",
	"Anne, I vote more cars race Rome to Vienna.",
	"Are Mac ‘n’ Oliver ever evil on camera?",
	"Are we not drawn onward to new era?",
	"Are we not drawn onward, we few, drawn onward to new era?",
	"Are we not pure? No sir! Panama’s moody Noriega brags. It is garbage! Irony dooms a man; a prisoner up to new era.",
	"Art, name no tub time. Emit but one mantra.",
	"As I pee, sir, I see Pisa!",
	"Avid diva."
	};
	
	
	static String[] list2 = {
		"abodef i fedoba",
		"Borrow or rob?",
		"apple",
		"not a palindrome",
		"abode fife doba",
		"orange",
		"a b o d e f i f e d o b a",
		};
	
	
	static Hashtable<String, List<Integer>> table = new Hashtable<String,List<Integer>>();
	
	
	public static void main(String[] args)
	{
		PalSort app = new PalSort();
		
		//This will determine whether any particular String element is a palindrome
		for(int i = 0 ;i<list.length; i++)
		{
			//remove white space
			//remove non-alphanumeric
			//convert to lower case
			String temp = app.stripSpaces(app.removeNonAlphaNumeric(list[i])).toLowerCase();
			app.isPalindrome(temp);
		}
				
	}
	
	
	/**
	 * Reverse input
	 * @param input
	 * @return
	 */
	public String reverse(String input)
	{
		return new StringBuilder(input).reverse().toString();
	}
	
	
	/**
	 * Remove white spaces from input
	 * @param input
	 * @return
	 */
	public String stripSpaces(String input)
	{
		return input.replaceAll("\\s+","");
	}
	
	
	/**
	 * Strip punctuation and non alpha-numeric characters
	 * @param input
	 * @return
	 */
	public String removeNonAlphaNumeric(String input)
	{
		return input.replaceAll("[^A-Za-z0-9 ]", "");
	}
	
	
	//input is a string with whitespace and non alphas removed
	public void isPalindrome(String input)
	{

		//Split into an array of chars and sort
		String [] chars= input.split("(?<!\\A)(?=[a-z])");
		Arrays.sort(chars);
		
		
		//list to store the paly
		List<String> formedPaly = new ArrayList<String>();		
		// list to store unique chars
		List<String> uniqeChars = new ArrayList<String>();
		

		for(int i=0; i<chars.length-1; i++){
			
			if(chars[i].equals(chars[i+1])){
			//  if two identical chars are together, 
			//	add to beginning and end of list
				formedPaly.add(0, chars[i]);
				formedPaly.add(formedPaly.size(), chars[i]);
				i++;
			}
			else{
			// otherwise char is unique, add to separate list
				uniqeChars.add(chars[i]);
			}
						
		}
		
		// if unique chars are greater than 1, paly not possible
		if(uniqeChars.size()>1){
			System.out.println("Not a Paly");
		}
		// if uniques are 0, paly already formed. print it out
		else if(uniqeChars.size()==0){
			System.out.println(StringUtils.join(formedPaly, ""));
		}
		// otherwise place unique char in middle of List to form paly
		else{
			int size = formedPaly.size()/2;
			formedPaly.add(size, StringUtils.join(uniqeChars, ""));
			System.out.println(StringUtils.join(formedPaly, ""));
		}
	}
}