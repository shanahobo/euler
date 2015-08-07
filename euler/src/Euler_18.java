import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;




/**

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 
However, Problem 67, is the same challenge with a triangle containing one-hundred rows; 
it cannot be solved by brute force, and requires a clever method! ;o)

**/

class Euler_18
{
	public static void main (String[] args) throws FileNotFoundException
	{
		// Open the file
		FileInputStream fstream = new FileInputStream("C:/Users/Niall/Desktop/numbers.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		int count = 0;
		int biggest = 0;
		int viableIndex = 0;
		int updatedIndex = 0;

		String strLine;
		try{
			//Read File Line By Line
			while ((strLine = br.readLine()) != null)   {
			    String[] arr = strLine.split(" ");			    
			    for(int i=0; i< arr.length; i++){
			    	if(i>viableIndex+1){
			    		break;
			    	}
			    	int a = Integer.parseInt(arr[i]);
			    	
			    	if(a>biggest&&i==viableIndex||a>biggest&&i==viableIndex+1){
			    		biggest = a;
			    		updatedIndex = i;
			    	}
			    }
			    //String str = Integer.toString(biggest);
			    //viableIndex = java.util.Arrays.asList(arr).lastIndexOf(str);
			    count += biggest;
			    biggest = 0;
			    viableIndex = updatedIndex;
			}

			//Close the input stream
			br.close();

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.print(count);
	}
}