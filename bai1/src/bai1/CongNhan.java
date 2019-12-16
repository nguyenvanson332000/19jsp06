package bai1;

public class CongNhan extends CanBo {
	private int bac;

	public CongNhan(String ten, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Bac:       "+ bac);
	}
}
