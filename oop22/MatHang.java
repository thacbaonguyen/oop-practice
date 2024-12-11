package OOP22;

public class MatHang {
	private String maMatHang, tenMatHang, donViTinh;
	private long giaMua, giaBan;
	public MatHang(int id, String tenMatHang, String donViTinh, long giaMua, long giaBan) {
		super();
		this.maMatHang = "MH" + String.format("%03d", id);
		this.tenMatHang = tenMatHang;
		this.donViTinh = donViTinh;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
	}
	public String getMaMatHang() {
		return maMatHang;
	}
	public long getGiaBan() {
		return giaBan;
	}
	@Override
	public String toString() {
		return tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " ";
	}
}
