
public class Euler_03 {

	public static void main(String[] args) {
		long s = 0, i = 600851475143L;
		for (int n = 2; n < i; n++) while (i % n == 0) {
			i /= n;
			s = i;
			n = 2;
		}
		System.out.println(s);
	}

}
