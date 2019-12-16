package bai1;

public class KySu extends CanBo {
	private String nganhDaoTao;
	
	public KySu(String ten, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Nganh DT:  "+ nganhDaoTao);
	}
}
