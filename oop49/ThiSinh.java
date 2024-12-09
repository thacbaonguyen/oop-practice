package oop49;

public class ThiSinh implements Comparable<ThiSinh>{
	private String maThiSinh;
	private String hoTen;
	private double diemThi;
	private int khuVuc;
	private String danToc;
	private double tongDiem;
	private String trangThai;
	private double diemUT;
	private static int cnt = 1;
	public ThiSinh(String hoTen, double diemThi, String danToc, int khuVuc ) {
		super();
		maThiSinh = "TS" + String.format("%02d", cnt++);
		hoTen = hoTen.toLowerCase();
		String s[] = hoTen.trim().split("\\s+");
		this.hoTen = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
		for(int i = 1; i < s.length; i++) this.hoTen += " " + s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
		this.diemThi = diemThi;
		this.khuVuc = khuVuc;
		this.danToc = danToc;
		if(khuVuc == 1) diemUT = 1.5;
		else if(khuVuc == 2) diemUT = 1;
		else if(khuVuc == 3) diemUT = 0;
		if(!danToc.equals("Kinh")) diemUT+= 1.5;
		tongDiem = diemThi + diemUT;
		if(tongDiem < 20.5) trangThai = "Truot";
		else trangThai = "Do";
	}
	@Override
	public int compareTo(ThiSinh o) {
		if(tongDiem != o.tongDiem) return Double.compare(o.tongDiem, this.tongDiem);
		return this.maThiSinh.compareTo(o.maThiSinh);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maThiSinh +" " + hoTen + " " + String.format("%.1f", tongDiem) + " " + trangThai;
	}
	
}
