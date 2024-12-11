package Mang_Va_Xau;

import java.math.BigInteger;
import java.util.Scanner;

public class bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long a = sc.nextLong();
            String b = sc.next();
            long bModA = calculateMod(b, a);
            long result = gcd(a, bModA);
            System.out.println(result);
        }
    }

    private static long calculateMod(String b, long a) {
        long mod = 0;
        for (int i = 0; i < b.length(); i++) {
            mod = (mod * 10 + (b.charAt(i) - '0')) % a;
        }
        return mod;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
