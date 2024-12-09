
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class KhachHang{
	private String ma, ten, soPhong, ngayNhan, ngayTra;
	private long tienDV;
	public KhachHang(int ma, String ten, String soPhong, String ngayNhan, String ngayTra, long tienDV) {
		this.ma = "KH" + String.format("%02d", ma);
		this.ten = ten;
		this.soPhong = soPhong;
		this.ngayNhan = ngayNhan;
		this.ngayTra = ngayTra;
		this.tienDV = tienDV;
	}
	public String chuanHoaTen(){
		String[] tmp = ten.trim().split("\\s+");
		String newTen = "";
		for(String x : tmp){
			newTen += x.substring(0,1).toUpperCase();
			newTen += x.substring(1).toLowerCase();
			newTen += " ";
		}
		return newTen.trim();
	}
	public static String chuanHoaNgay(String ngay){
		StringBuilder sb = new StringBuilder(ngay);
		if(sb.charAt(2) != '/')
			sb.insert(0, "0");
		if(sb.charAt(5) != '/')
			sb.insert(3, "0");
		return sb.toString();
	}
	public long soNgayO(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nhan = LocalDate.parse(chuanHoaNgay(ngayNhan.trim()), dtf);
		LocalDate tra = LocalDate.parse(chuanHoaNgay(ngayTra.trim()), dtf);
		return ChronoUnit.DAYS.between(nhan, tra)+1;
	}
	public long thanhTien(){
		if(soPhong.startsWith("1")){
			return soNgayO()*25 + tienDV;
		}
		else if(soPhong.startsWith("2")){
			return soNgayO()*34 + tienDV;
		}
		else if(soPhong.startsWith("3")){
			return soNgayO()*50 + tienDV;
		}
		else{
			return soNgayO()*80 + tienDV;
		}
	}
	public String toString(){
		return ma + " " + chuanHoaTen() + " " + soPhong + " " + soNgayO() + " " + thanhTien();
	}
	
}
public class test{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		ArrayList<KhachHang> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
			sc.nextLine();
			arr.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLong()));
		}
		Collections.sort(arr, new Comparator<KhachHang>(){
			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				if(o1.thanhTien() > o2.thanhTien())
						return -1;
				else
					return 1;
			}
			
		});
		for(KhachHang x : arr){
			System.out.println(x);
		}
	}
}

