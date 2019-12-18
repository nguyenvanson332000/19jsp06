package bai2;

import java.util.ArrayList;

public class QuanLySach {

	private ArrayList<TaiLieu> dsTaiLieu;

	public QuanLySach() {
		dsTaiLieu = new ArrayList<TaiLieu>();
	}

	public void themTL(TaiLieu taiLieu) {
		String maTL = taiLieu.getMaTL();

		if (kiemTraMaTL(maTL)) {
			System.out.println("Loi: Da ton tai tai lieu");
		} else {
			dsTaiLieu.add(taiLieu);
		}
	}

	public void xoaTL(String maTL) {
		int vt = -1;
		for (int i = 0; i < dsTaiLieu.size(); i++) {
			TaiLieu taiLieu = dsTaiLieu.get(i);

			if (maTL.equals(taiLieu.getMaTL())) {
				vt = i;
				break;
			}
		}
		if (vt != -1) {
			// để xóa phần tử thứ vt ra khỏi ArrayList
			dsTaiLieu.remove(vt);
		}
	}

	private boolean kiemTraMaTL(String maTL) {
		for (TaiLieu taiLieu : dsTaiLieu) {
			if (maTL.equals(taiLieu.getMaTL())) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<TaiLieu> timKiemTL(KieuTaiLieu kTL){
		ArrayList<TaiLieu> dsTL = new ArrayList<TaiLieu>();
		
		for (TaiLieu taiLieu: dsTaiLieu) {
			if (taiLieu.getKieuTL() == kTL) {
				dsTL.add(taiLieu);
			}
		}
		
		return dsTL;
	}
}
