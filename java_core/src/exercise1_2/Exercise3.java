package exercise1_2;

public class Exercise3 {

	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		} else if (n < 4) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(11));
		System.out.println(isPrime(9));
	}
}
