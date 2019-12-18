package bai2;

public class TaiLieu {
	private String maTL;
	private String tenNXB;
	private int soBPH;
	private KieuTaiLieu kieuTL;
	
	public TaiLieu(String maTL, String tenNXB, int soBPH) {
		this.maTL = maTL;
		this.tenNXB = tenNXB;
		this.soBPH = soBPH;
	}
	public String getMaTL() {
		return maTL;
	}
	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBPH() {
		return soBPH;
	}
	public void setSoBPH(int soBPH) {
		this.soBPH = soBPH;
	}
	
	public KieuTaiLieu getKieuTL() {
		return kieuTL;
	}
	
	public void setKieuTL(KieuTaiLieu kieuTL) {
		this.kieuTL = kieuTL;
	}
}
