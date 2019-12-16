package bai1;

import java.util.ArrayList;

public class MainClass {

	static ArrayList<CanBo> danhSachCanBo = new ArrayList<CanBo>();

	static void themCanBo(CanBo canbo) {
		danhSachCanBo.add(canbo);
	}

	static ArrayList<CanBo> timKiem(String ten) {
		ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();

		for (CanBo canbo : danhSachCanBo) {
			String tenCanBo = canbo.getTen();
			if (tenCanBo.equalsIgnoreCase(ten)) {
				dsCanBo.add(canbo);	
			}
		}

		return dsCanBo;
	}
	
	static void hienThiDSCanBo() {
		for (CanBo canbo: danhSachCanBo) {
			canbo.hienThi();
			System.out.println("------------");
		}
	}

	public static void main(String[] args) {
		CongNhan congNhan = new CongNhan("CN1", 20, GioiTinh.NAM, "DN", 2);
		KySu kySu = new KySu("KS1", 19, GioiTinh.NU, "HCM", "CNTT");
		NhanVien nhanVien1 = new NhanVien("NV", 22, GioiTinh.KHAC, "HN", "DTVT");
		NhanVien nhanVien2 = new NhanVien("Nv", 21, GioiTinh.KHAC, "DN", "DTVT");

		themCanBo(congNhan);
		themCanBo(kySu);
		themCanBo(nhanVien1);
		themCanBo(nhanVien2);
		
		System.out.println("----Hien thi danh sach----");
		hienThiDSCanBo();
		
		System.out.println("----Tim kiem-----");
		
		String ten = "Nv";
		ArrayList<CanBo> dsCanBo = timKiem(ten);
		for (CanBo canBo: dsCanBo) {
			canBo.hienThi();
			System.out.println("------------");
		}
	}
}
