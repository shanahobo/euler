import java.util.Scanner;

public class FizzBuzz{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		for(int i =1; i<value;i++){
			
			if (i % 3 == 0){
				System.out.println(i % 5 == 0 ? "FizzBuzz" : "Fizz");
			}
			else if (i % 5 == 0){
						System.out.println("Buzz");
			}
			else{
					System.out.println(i);
			}
			
		}
	}
}