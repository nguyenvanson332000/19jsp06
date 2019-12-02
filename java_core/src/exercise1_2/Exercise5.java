package exercise1_2;

public class Exercise5 {

	static int findMostFreqEle(int[] arr) {
		int max = 1, e = arr[0];
		for (int x : arr) {
			int count = 0;
			for (int y : arr) {
				if (x == y) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				e = x;
			}
		}
		return e;
	}

	/*
	static int findMostFreqEle(int[] arr) {
		int max = 1, e = arr[0], count = 1, a = e;
		for (int i = 1; i < arr.length; i++) {
			if (a == arr[i]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					e = a;
				}
				count = 1;
				a = arr[i];
			}
		}
		return e;
	}
	*/
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 4, 5, 4, 3, 3, 3 };
		int[] arr2 = { 1, 2, 3, 3, 3, 3, 4, 4, 5 };
		System.out.println(findMostFreqEle(arr1));
		System.out.println(findMostFreqEle(arr2));
	}
}
