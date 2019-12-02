package exercise1_2;

public class Exercise7 {

	static int countOdd(int[] arr) {
		int count = 0;
		for (int a : arr) {
			if (a % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 7, 8 };
		System.out.println(countOdd(arr));
	}
}
