package oop36;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang> {
    public static int maKH = 0;
    public static final String KEY = "KH";
    public static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private String maKHang;
    private String tenKH;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKHang = String.format("%s%03d", KEY, ++maKH);
        String[] tmp = tenKH.trim().toLowerCase().split("\\s+");
        this.tenKH = tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1);
        for (int i = 1; i < tmp.length; ++i)
            this.tenKH += (" " + tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1));
        this.gioiTinh = gioiTinh;
        tmp = ngaySinh.split("/");
        this.ngaySinh = String.format("%02d/%02d/%s", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), tmp[2]);
        this.diaChi = diaChi;
    }

    public int compareTo(KhachHang o) {
        try {
            return Long.compare(format.parse(this.ngaySinh).getTime(), format.parse(o.ngaySinh).getTime());
        } catch (ParseException e) {
            return 0;
        }
    }
    public String toString() {
        return String.format("%s %s %s %s %s", this.maKH, this.tenKH, this.gioiTinh, this.diaChi, this.ngaySinh);
    }
}
