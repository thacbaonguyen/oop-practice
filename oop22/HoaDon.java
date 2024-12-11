package OOP22;

public class HoaDon {
	private String maHoaDon;
	private String maKhachHang, maMatHang;
	private int soLuong;
	public HoaDon(int id, String maKhachHang, String maMatHang, int soLuong) {
		super();
		this.maHoaDon = "HD" + String.format("%03d", id);
		this.maKhachHang = maKhachHang;
		this.maMatHang = maMatHang;
		this.soLuong = soLuong;
	}
	
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public String getMaMatHang() {
		return maMatHang;
	}

	public int getSoLuong() {
		return soLuong;
	}
	public String toString1() {
		return maHoaDon + " ";
	}
	public String toString2() {
		return soLuong + " ";
	}
}
