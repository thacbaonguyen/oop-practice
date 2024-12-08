package oop34;

public class LopHoc implements Comparable<LopHoc> {
    private String maMH;
    private String tenMH;
    private String nhom;
    private String tenGV;

    public LopHoc(String maMH, String tenMH, String nhom, String tenGV) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String gettenGV() {
        return tenGV;
    }

    @Override
    public int compareTo(LopHoc o) {
        if (!this.maMH.equals(o.maMH)) return this.maMH.compareTo(o.maMH);
        return this.nhom.compareTo(o.nhom);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.maMH, this.tenMH, this.nhom);
    }
}

