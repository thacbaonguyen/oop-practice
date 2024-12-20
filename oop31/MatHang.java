package OOP31;

public class MatHang implements Comparable<MatHang> {
    public static int ID = 0;
    public final String KEY = "MH";
    private String id;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;

    public MatHang(String ten, String donVi, int giaMua, int giaBan) {
        this.id = String.format("%s%03d", KEY, ++ID);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public String getdonVi() {
        return donVi;
    }

    public void setdonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getgiaMua() {
        return giaMua;
    }

    public void setgiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getgiaBan() {
        return giaBan;
    }

    public void setgiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getProfit() {
        return this.giaBan - this.giaMua;
    }

    @Override
    public int compareTo(MatHang o) {
        if (this.getProfit() != o.getProfit()) return -Integer.compare(this.getProfit(), o.getProfit());
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", this.id, this.ten, this.donVi, this.giaMua, this.giaBan, this.getProfit());
    }
}
