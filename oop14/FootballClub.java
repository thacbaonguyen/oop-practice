package OOP14;

public class FootballClub {
	private String maClb;
	private String tenClb;
	private long giaVe;
	private String maTranDau;
	private long soCdv;
	private int thuTu;
	public FootballClub(String maClb, String tenClb, long giaVe) {
		super();
		this.maClb = maClb;
		this.tenClb = tenClb;
		this.giaVe = giaVe;
	}
	
	public FootballClub(String maClb, String tenClb, long giaVe, String maTranDau, long soCdv, int thuTu) {
		super();
		this.maClb = maClb;
		this.tenClb = tenClb;
		this.giaVe = giaVe;
		this.maTranDau = maTranDau;
		this.soCdv = soCdv;
		this.thuTu = thuTu;
	}

	public String getMaClb() {
		return maClb;
	}

	public String getTenClb() {
		return tenClb;
	}

	public long getGiaVe() {
		return giaVe;
	}
	public int getThuTu() {
		return thuTu;
	}
	
	public long getSoCdv() {
		return soCdv;
	}
	public String toString() {
		long doanhThu = soCdv* giaVe;
		return maTranDau + " " + tenClb + " " + doanhThu;
	}
}
