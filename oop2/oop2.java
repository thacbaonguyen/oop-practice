package oop2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class oop2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Student> arr = new ArrayList<>();
		String nature = "SV";
		String maSv = "001";
		for(int i = 0 ; i < n; i++) {
			Student student = new Student();
			String hoTen = sc.nextLine();
			String lop = sc.nextLine();
			String ngaySinh = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate birthDay = LocalDate.parse(ngaySinh, formatter);
			float gpa = sc.nextFloat();
			sc.nextLine();
			student.setHoTen(hoTen);
			student.setLop(lop);
			student.setNgaySinh(birthDay);
			student.setGpa(gpa);
			String newMsv = nature + maSv;
			student.setMaSv(newMsv);
			int maSvNum = Integer.parseInt(maSv);
			maSvNum++;
			maSv = String.format("%03d", maSvNum);
			arr.add(student);
		}
		for(Student result : arr) {
			result.print();
		}
	}
}
