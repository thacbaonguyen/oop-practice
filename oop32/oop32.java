package OOP32;

import java.util.*;

public class oop32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
        int t=sc.nextInt();
        while(t-->0) {
            sc.nextLine();
            SinhVien a = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
            System.out.println(a);
        }
        sc.close();
    }
}
