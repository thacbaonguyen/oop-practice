package oop41;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id;
    private String hoTen;
    private float toan;
    private float ly;
    private float hoa;
    private float diemUuTien;
    private String trangThai;

    public ThiSinh(String id, String hoTen, float toan, float ly, float hoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        switch (id.charAt(2)) {
            case '1':
                this.diemUuTien = 0.5f;
                break;
            case '2':
                this.diemUuTien = 1f;
                break;
            case '3':
                this.diemUuTien = 2.5f;
                break;
            default:
                break;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getdiemUuTien() {
        return diemUuTien;
    }

    public void setdiemUuTien(float diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public String gettrangThai() {
        return trangThai;
    }

    public void settrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public float getMark() {
        return this.toan * 2 + this.ly + this.hoa;
    }

    public float getTotalMark() {
        return this.toan * 2 + this.ly + this.hoa + this.diemUuTien;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return -Float.compare(this.getMark(), o.getMark());
    }

    @Override
    public String toString() {
        return  this.id + " " +
                this.hoTen + " " +
                ((int) this.diemUuTien == this.diemUuTien ? String.format("%d", (int) this.diemUuTien) : String.format("%.1f", this.diemUuTien)) + " " +
                ((int) this.getMark() == this.getMark() ? String.format("%d", (int) this.getMark()) : String.format("%.1f", this.getMark())) + " " +
                this.trangThai;
    }
}
