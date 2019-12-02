package exercise1_2;

public class Exercise1 {

	static int getDayOfMonth(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		int month = 3;
		int dayOfMonth = getDayOfMonth(month);
		System.out.println(dayOfMonth);
	}
}
