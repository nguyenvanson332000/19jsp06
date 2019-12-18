package bai2;

import java.time.LocalDate;

public class Bao extends TaiLieu {
	private LocalDate ngayPH;

	public Bao(String maTL, String tenNXB, int soBPH, LocalDate ngayPH) {
		super(maTL, tenNXB, soBPH);
		this.ngayPH = ngayPH;
		setKieuTL(KieuTaiLieu.BAO);
	}

	public LocalDate getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(LocalDate ngayPH) {
		this.ngayPH = ngayPH;
	}
}
