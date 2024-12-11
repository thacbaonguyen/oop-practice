package oop33;

import java.util.*;


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
