package bai1;

public class CanBo {
	private String ten;
	private int tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;
	
	public CanBo(String ten, int tuoi, GioiTinh gioiTinh, String diaChi) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void hienThi() {
		System.out.println("Ten:       "+ ten);
		System.out.println("Tuoi:      "+ tuoi);
		System.out.println("Gioi tinh: "+ gioiTinh);
		System.out.println("Dia chi:   "+ diaChi);
	}
}
