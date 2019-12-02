package exercise1_2;

public class Exercise4 {

	static int fib(int n) {
		int f1 = 0, f2 = 1, f = 0;
		for (int i = 1; i < n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}

		return f;
	}

	public static void main(String[] args) {
		System.out.println(fib(10));
	}
}
