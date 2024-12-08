package oop33;

public class LopHoc implements Comparable<LopHoc> {
    private String maMonHoc;
    private String tenMonHoc;
    private String nhom;
    private String tenGV;

    public LopHoc(String maMonHoc, String tenMonHoc, String nhom, String tenGV) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String getmaMonHoc() {
        return maMonHoc;
    }

    public String gettenMonHoc() {
        return tenMonHoc;
    }

    @Override
    public int compareTo(LopHoc o) {
        return this.nhom.compareTo(o.nhom);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.nhom, this.tenGV);
    }
}

