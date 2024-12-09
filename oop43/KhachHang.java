package oop43;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
	private String maKH, tenKH, soPhong;
	private Date ngayNhan, ngayTra;
	private long tienPhatSinh;
	private long donGia, thanhTien, soNgay;
	private static int cnt = 1;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public KhachHang(String tenKH,  String soPhong, String ngayNhan, String ngayTra, long tienPhatSinh)
			throws ParseException {
		super();
		maKH = String.format("KH%02d", cnt++);
		tenKH = tenKH.trim().toLowerCase();
        String[] s = tenKH.split("\\s+");
        this.tenKH = "";
        for (String i : s)
            this.tenKH += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
		this.ngayNhan = sdf.parse(ngayNhan);
		this.ngayTra = sdf.parse(ngayTra);
		this.tienPhatSinh = tienPhatSinh;
		this.soPhong = soPhong;
		if(soPhong.charAt(0) == '1') donGia = 25;
		else if(soPhong.charAt(0) == '2') donGia = 34;
		else if(soPhong.charAt(0) == '3') donGia = 50;
		else if(soPhong.charAt(0) == '4') donGia = 80;
		soNgay = ChronoUnit.DAYS.between(this.ngayNhan.toInstant(), this.ngayTra.toInstant()) + 1;
		thanhTien = soNgay * donGia + tienPhatSinh;
	}
	public Date getNgayNhan() {
		return ngayNhan;
	}
	public Date getNgayTra() {
		return ngayTra;
	}
	
	public long getSoNgay() {
		return soNgay;
	}
	@Override
	public int compareTo(KhachHang o) {
		return (int)(o.thanhTien - thanhTien);
	}
	@Override
	public String toString() {
		return maKH + " " + tenKH + soPhong + " " + soNgay + " " + thanhTien ;
	}
}