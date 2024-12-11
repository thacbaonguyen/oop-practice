package OOP32;

public class SinhVien {
    public static final String KEY = "B20DCCN";
    public static int ID = 0;
    private String id;
    private String hoTen;
    private String diem;
    private String ngaySinh;
    private double gpa;

    public SinhVien(String hoTen, String diem, String ngaySinh, double gpa) {
        this.id = String.format("%s%03d", KEY, ++ID);
        this.hoTen = hoTen;
        this.diem = diem;
        String[] tmp = ngaySinh.split("/");
        this.ngaySinh = String.format("%02d/%02d/%s", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), tmp[2]);
        this.gpa = gpa;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getdiem() {
        return diem;
    }

    public void setdiem(String diem) {
        this.diem = diem;
    }

    public String getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", this.id, this.hoTen, this.diem, this.ngaySinh, this.gpa);
    }
}
