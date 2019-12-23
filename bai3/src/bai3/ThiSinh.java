package bai3;

public class ThiSinh {
	private String sbd;
	private String hoTen;
	private String diaChi;
	private int mucUT;
	private KhoiThi khoiThi;
	
	public ThiSinh(String sbd, String hoTen, String diaChi, int mucUT, KhoiThi khoiThi) {
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUT = mucUT;
		this.khoiThi = khoiThi;
	}
	
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUT() {
		return mucUT;
	}
	public void setMucUT(int mucUT) {
		this.mucUT = mucUT;
	}
	public KhoiThi getKhoiThi() {
		return khoiThi;
	}
	public void setKhoiThi(KhoiThi khoiThi) {
		this.khoiThi = khoiThi;
	}
}
