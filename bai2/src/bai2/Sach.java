package bai2;

public class Sach extends TaiLieu {
	private String tenTG;
	private int soTrang;
	
	public Sach(String maTL, String tenNXB, int soBPH, String tenTG, int soTrang) {
		super(maTL, tenNXB, soBPH);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
		setKieuTL(KieuTaiLieu.SACH);
	}
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
}
