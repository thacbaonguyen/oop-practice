package oop33;

import java.util.*;

//class LopHoc implements Comparable<LopHoc> {
//    private String maMonHoc;
//    private String tenMonHoc;
//    private String nhom;
//    private String tenGV;
//
//    public LopHoc(String maMonHoc, String tenMonHoc, String nhom, String tenGV) {
//        this.maMonHoc = maMonHoc;
//        this.tenMonHoc = tenMonHoc;
//        this.nhom = nhom;
//        this.tenGV = tenGV;
//    }
//
//    public String getmaMonHoc() {
//        return maMonHoc;
//    }
//
//    public String gettenMonHoc() {
//        return tenMonHoc;
//    }
//
//    @Override
//    public int compareTo(LopHoc o) {
//        return this.nhom.compareTo(o.nhom);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s", this.nhom, this.tenGV);
//    }
//}
public class oop33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<LopHoc> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String subjectId = sc.next();
            sc.nextLine();
            String subjectName = sc.nextLine();
            String group = sc.next();
            sc.nextLine();
            String teacherName = sc.nextLine();
            a.add(new LopHoc(subjectId, subjectName, group, teacherName));
        }
        Collections.sort(a);
        int m = sc.nextInt();
        while (m-- > 0) {
            String id = sc.next();
            String name = "";
            for (LopHoc x : a)
                if (x.getmaMonHoc().equals(id)) name = x.gettenMonHoc();
            System.out.printf("Danh sach nhom lop mon %s:\n", name);
            for (LopHoc x : a)
                if (x.getmaMonHoc().equals(id)) System.out.println(x);
        }
        sc.close();
    }
}
