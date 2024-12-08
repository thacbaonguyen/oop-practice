package oop36;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class oop36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String name = sc.nextLine();
            String gender = sc.next();
            String dob = sc.next();
            sc.nextLine();
            String address = sc.nextLine();
            a.add(new KhachHang(name, gender, dob, address));
        }
        Collections.sort(a);
        for (KhachHang x : a) System.out.println(x);
        sc.close();
    }
}