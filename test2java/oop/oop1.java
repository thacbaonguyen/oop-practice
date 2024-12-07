package test2java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class oop1 {
	public static void main(String arg[]) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		String hoTen = sc.nextLine();
		person.setHoTen(hoTen);
		String ngaySinh = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			Date birthDay = sdf.parse(ngaySinh);
			person.setNgaySinh(birthDay);
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		float diem1 = sc.nextFloat();
		float diem2 = sc.nextFloat();
		float diem3 = sc.nextFloat();
		person.setDiem1(diem1);
		person.setDiem2(diem2);
		person.setDiem3(diem3);
		float tongDiem = diem1 + diem2 + diem3;
		person.setTongDiem(tongDiem);
		person.print();
	}
}

