package oop35;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String phongBanmaNV;
    private int luong;

    public NhanVien(String maNV, String tenNV, int baseluong, int numOfWorks) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        char nhom = maNV.charAt(0);
        int namLamViec = Integer.parseInt(maNV.substring(1, 3));
        this.phongBanmaNV = maNV.substring(3);
        int coefficient = 0;
        if (nhom == 'A') {
            if (namLamViec >= 16) coefficient = 20;
            else if (namLamViec >= 9) coefficient = 14;
            else if (namLamViec >= 4) coefficient = 12;
            else coefficient = 10;
        } else if (nhom == 'B') {
            if (namLamViec >= 16) coefficient = 16;
            else if (namLamViec >= 9) coefficient = 13;
            else if (namLamViec >= 4) coefficient = 11;
            else coefficient = 10;
        } else if (nhom == 'C') {
            if (namLamViec >= 16) coefficient = 14;
            else if (namLamViec >= 9) coefficient = 12;
            else if (namLamViec >= 4) coefficient = 10;
            else coefficient = 9;
        } else {
            if (namLamViec >= 16) coefficient = 13;
            else if (namLamViec >= 9) coefficient = 11;
            else if (namLamViec >= 4) coefficient = 9;
            else coefficient = 8;
        }
        this.luong = baseluong * 1000 * numOfWorks * coefficient;
    }

    public String getPhongBanmaNV() {
        return phongBanmaNV;
    }
    public String toString() {
        return String.format("%s %s %d", this.maNV, this.tenNV, this.luong);
    }
}
