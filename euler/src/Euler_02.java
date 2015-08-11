public class Euler_02 {

	public static void main(String[] args) {
		int firstNum = 1;
		int secondNum = 2;
		int sum = 0;
		int fibonacciNum;

		while (secondNum <= 4000000) {
			if (secondNum % 2 == 0) {
				sum = sum + secondNum;
			}
			fibonacciNum = firstNum + secondNum;

			firstNum = secondNum;
			secondNum = fibonacciNum;
		}
		System.out.println(sum);

	}

}
