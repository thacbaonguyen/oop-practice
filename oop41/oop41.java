package oop41;

import java.util.*;

//class ThiSinh implements Comparable<ThiSinh> {
//    private String id;
//    private String hoTen;
//    private float toan;
//    private float ly;
//    private float hoa;
//    private float diemUuTien;
//    private String trangThai;
//
//    public ThiSinh(String id, String hoTen, float toan, float ly, float hoa) {
//        this.id = id;
//        this.hoTen = hoTen;
//        this.toan = toan;
//        this.ly = ly;
//        this.hoa = hoa;
//        switch (id.charAt(2)) {
//            case '1':
//                this.diemUuTien = 0.5f;
//                break;
//            case '2':
//                this.diemUuTien = 1f;
//                break;
//            case '3':
//                this.diemUuTien = 2.5f;
//                break;
//            default:
//                break;
//        }
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String gethoTen() {
//        return hoTen;
//    }
//
//    public void sethoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//
//    public float getToan() {
//        return toan;
//    }
//
//    public void setToan(float toan) {
//        this.toan = toan;
//    }
//
//    public float getLy() {
//        return ly;
//    }
//
//    public void setLy(float ly) {
//        this.ly = ly;
//    }
//
//    public float getHoa() {
//        return hoa;
//    }
//
//    public void setHoa(float hoa) {
//        this.hoa = hoa;
//    }
//
//    public float getdiemUuTien() {
//        return diemUuTien;
//    }
//
//    public void setdiemUuTien(float diemUuTien) {
//        this.diemUuTien = diemUuTien;
//    }
//
//    public String gettrangThai() {
//        return trangThai;
//    }
//
//    public void settrangThai(String trangThai) {
//        this.trangThai = trangThai;
//    }
//
//    public float getMark() {
//        return this.toan * 2 + this.ly + this.hoa;
//    }
//
//    public float getTotalMark() {
//        return this.toan * 2 + this.ly + this.hoa + this.diemUuTien;
//    }
//
//    @Override
//    public int compareTo(ThiSinh o) {
//        return -Float.compare(this.getMark(), o.getMark());
//    }
//
//    @Override
//    public String toString() {
//        return  this.id + " " +
//                this.hoTen + " " +
//                ((int) this.diemUuTien == this.diemUuTien ? String.format("%d", (int) this.diemUuTien) : String.format("%.1f", this.diemUuTien)) + " " +
//                ((int) this.getMark() == this.getMark() ? String.format("%d", (int) this.getMark()) : String.format("%.1f", this.getMark())) + " " +
//                this.trangThai;
//    }
//}

public class oop41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
        String id = sc.next();
        sc.nextLine();
        String hoTen = sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        ThiSinh a = new ThiSinh(id, hoTen, toan, ly, hoa);
        a.settrangThai(a.getTotalMark() >= 24f ? "TRUNG TUYEN" : "TRUOT");
        System.out.println(a);
    }
}