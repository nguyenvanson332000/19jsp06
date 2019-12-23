package bai3;

public enum KhoiThi {
	KHOI_A(Mon.TOAN, Mon.LY, Mon.HOA),
	KHOI_B(Mon.TOAN, Mon.LY, Mon.HOA),
	KHOI_C(Mon.TOAN, Mon.LY, Mon.HOA);

	private Mon[] dsMon;

	KhoiThi(Mon... dsMon) {
		this.dsMon = dsMon;
	}

	public Mon[] getDsMon() {
		return dsMon;
	}

	public void setDsMon(Mon[] dsMon) {
		this.dsMon = dsMon;
	}
}