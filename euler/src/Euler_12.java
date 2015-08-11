public class Euler_12 {

	public static void main(String[] args) {
		long result = 0l;
		long n = 1L;
		int count = 0;

		do {
			result += n; 
			n++;

			count = findDivisor(result);
			if (count > 500) {
				System.out.println("RESULT : " + result);
			}
		} while (count < 501);
	}

	static int findDivisor(long n) {
		long m = n;
		int count = 0;
		for (int i = 1; i < m; i++) {
			if (n % i == 0) { 
				long tmp = n / i; 
				if (i <= tmp) { 
					count += 2;
					m = tmp; 
				} else {
					break;
				}
			}
		}

		return count;
	}
}
