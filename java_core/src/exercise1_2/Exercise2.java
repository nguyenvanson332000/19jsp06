package exercise1_2;

public class Exercise2 {

	static int sumTheDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 7239797;
		System.out.println(sumTheDigits(n));
	}
}
