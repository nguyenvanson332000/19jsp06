package bai2;

import java.time.LocalDate;

public class MainClass {
	public static void main(String[] args) {
		QuanLySach qls = new QuanLySach();
		TapChi tc = new TapChi("TC1", "KD", 1, 1, 1);
		Sach sach = new Sach("NV1", "GD", 1, "LQD", 100);
		Bao bao = new Bao("TT1", "TT", 1, LocalDate.of(2019, 10, 10));
		qls.themTL(tc);
		qls.themTL(sach);
		qls.themTL(bao);
		
		TapChi tc1 = new TapChi("TC1", "KDD", 1, 1, 1);
		qls.themTL(tc1);
		
		qls.xoaTL("TT1");
		
		qls.timKiemTL(KieuTaiLieu.SACH);
	}
}
