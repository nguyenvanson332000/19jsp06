package bai3;

public class MainClass {

	public static void main(String[] args) {
		ThiSinh thiSinh = new ThiSinh("1", "A", "B", 1, KhoiThi.KHOI_A);
		System.out.println(thiSinh.getKhoiThi());
		System.out.println(thiSinh.getKhoiThi().getDsMon());
	}

	static void f1(int[] a) {
		System.out.println(a.length);
	}

	static int sum(int... arr) {
		int s = 0;
		for (int a : arr) {
			s += a;
		}

		return s;
	}
}
