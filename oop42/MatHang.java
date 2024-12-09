package oop42;

public class MatHang implements Comparable<MatHang>{
		private String maMH, tenMH, nhomMH;
		private double giaMua, giaBan;
		private static int id = 0;
		public MatHang(String tenMH, String nhomMH, String giaMua, String giaBan) {
			super();
			this.maMH = "MH" + String.format("%02d", ++id);
			this.tenMH = tenMH;
			this.nhomMH = nhomMH;
			this.giaMua = Double.parseDouble(giaMua);
			this.giaBan = Double.parseDouble(giaBan);
		}
		
		public double getGiaMua() {
			return giaMua;
		}
		public double getGiaBan() {
			return giaBan;
		}
		@Override
		public int compareTo(MatHang o) {
			double l1 = this.giaBan - this.giaMua;
			double l2 = o.getGiaBan() - o.getGiaMua();
			return (int) (Math.ceil(l2 - l1));
		}
		@Override
		public String toString() {
			double loiNhuan = this.giaBan - this.giaMua;
		return maMH + " " + tenMH + " " + nhomMH + " " + String.format("%.2f", loiNhuan);
		}
}
