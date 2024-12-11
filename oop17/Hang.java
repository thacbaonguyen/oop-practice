package OOP17;

public class Hang {
	private String maHang;
	private String tenHang;
	private String xepLoai;
	private double lai;
	private long giaTriNhap;
	private long giaTriXuat;
	public Hang(String maHang, String tenHang, String xepLoai, double lai) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.xepLoai = xepLoai;
		this.lai = lai;
	}
	
	public Hang(String maHang, String tenHang, String xepLoai, double lai, long giaTriNhap, long giaTriXuat) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.xepLoai = xepLoai;
		this.lai = lai;
		this.giaTriNhap = giaTriNhap;
		this.giaTriXuat = giaTriXuat;
	}

	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public double getLai() {
		return lai;
	}
	public void setLai(double lai) {
		this.lai = lai;
	}
	public long getGiaTriNhap() {
		return giaTriNhap;
	}
	public void setGiaTriNhap(long giaTriNhap) {
		this.giaTriNhap = giaTriNhap;
	}
	public long getGiaTriXuat() {
		return giaTriXuat;
	}
	public void setGiaTriXuat(long giaTriXuat) {
		this.giaTriXuat = giaTriXuat;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	
	public String toString() {
		return maHang + " " + tenHang + " " + giaTriNhap + " " + giaTriXuat;
	}
}
