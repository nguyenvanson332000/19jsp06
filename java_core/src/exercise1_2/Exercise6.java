package exercise1_2;

public class Exercise6 {

	static boolean isSymmetry(int n) {
		int t = n, r = 0;
		while (t > 0) {
			r = r * 10 + t % 10;
			t /= 10;
		}
		return n == r;
	}

	public static void main(String[] args) {
		System.out.println(isSymmetry(123));
		System.out.println(isSymmetry(12321));
	}
}
