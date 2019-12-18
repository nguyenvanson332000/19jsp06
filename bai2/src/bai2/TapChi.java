package bai2;

public class TapChi extends TaiLieu {
	private int soPH;
	private int thangPH;
	
	public TapChi(String maTL, String tenNXB, int soBPH, int soPH, int thangPH) {
		super(maTL, tenNXB, soBPH);
		this.soPH = soPH;
		this.thangPH = thangPH;
		setKieuTL(KieuTaiLieu.TAP_CHI);
	}

	public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public int getThangPH() {
		return thangPH;
	}

	public void setThangPH(int thangPH) {
		this.thangPH = thangPH;
	}
}
