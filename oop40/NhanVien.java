package oop40;

public class NhanVien {
    public static int ii = 0;
    public static final String KEY = "NV";
    private String maNV;
    private String tenNV;
    private int luongCoBan;
    private int ngayLamViec;
    private String viTri;
    private int luong;
    private int thuongLuong;
    private int phuCap;

    public NhanVien(String tenNV, int luongCoBan, int ngayLamViec, String viTri) {
        this.maNV = String.format("%s%02d", KEY, ++ii);
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
        this.ngayLamViec = ngayLamViec;
        this.viTri = viTri;
        this.luong = this.luongCoBan * this.ngayLamViec;
        if (ngayLamViec>=25) this.thuongLuong=(int)(this.luong*0.2);
        else if (ngayLamViec>=22) this.thuongLuong=(int)(this.luong*0.1);
        else this.thuongLuong=0;
        switch (viTri){
            case "GD":
                this.phuCap=250000;
                break;
            case "PGD":
                this.phuCap=200000;
                break;
            case "TP":
                this.phuCap=180000;
                break;
            case "NV":
                this.phuCap=150000;
                break;
            default:
                break;
        }
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV;
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getluongCoBan() {
        return luongCoBan;
    }

    public void setluongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getngayLamViec() {
        return ngayLamViec;
    }

    public void setngayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getviTri() {
        return viTri;
    }

    public void setviTri(String viTri) {
        this.viTri = viTri;
    }

    public int getFinalluong() {
        return this.luong + this.thuongLuong + this.phuCap;
    }
    public String toString() {
        return String.format("%s %s %d %d %d %d",this.maNV, this.tenNV, this.luong, this.thuongLuong, this.phuCap, this.getFinalluong());
    }
}
