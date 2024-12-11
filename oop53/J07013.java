package oop53;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class J07013 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("SV.in"));
		ArrayList<SinhVien> arr = (ArrayList<SinhVien>) os.readObject() ;
		for(SinhVien x : arr) System.out.println(x);
	}
}
