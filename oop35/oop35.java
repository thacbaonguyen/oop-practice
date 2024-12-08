package oop35;

import java.util.*;


public class oop35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<PhongBan> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            a.add(new PhongBan(id, name));
        }
        int m = sc.nextInt();
        ArrayList<NhanVien> b = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int baseSalary = sc.nextInt();
            int numOfWorks = sc.nextInt();
            b.add(new NhanVien(id, name, baseSalary, numOfWorks));
        }
        String phongBanId = sc.next();
        String phongBanName = "";
        for (PhongBan x : a)
            if (x.getId().equals(phongBanId)) phongBanName = x.getName();
        System.out.printf("Bang luong phong %s:\n", phongBanName);
        for (NhanVien x : b)
            if (x.getPhongBanId().equals(phongBanId)) System.out.println(x);
        sc.close();
    }
}