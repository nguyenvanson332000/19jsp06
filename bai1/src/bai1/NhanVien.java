package bai1;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String ten, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Cong viec: "+ congViec);
	}
}
