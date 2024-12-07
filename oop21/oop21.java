package oop21;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class oop21 {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
	
}
//class IntSet {
//	private TreeSet<Integer> set;
//	public IntSet(int[] a) {
//		set = new TreeSet<>();
//		for(int x : a) {	
//			set.add(x);
//		}
//	}
//	public IntSet(TreeSet<Integer> set) {
//		this.set = new TreeSet<>(set);
//	}
//	public IntSet intersection(IntSet s2) {
//		TreeSet<Integer> result = new TreeSet<>(set);
//		result.retainAll(s2.set);
//		return new IntSet(result);
//	}
//	@Override
//	public String toString() {
//		StringBuilder str = new StringBuilder();
//		for(int x : set) {
//			str.append(x).append(" ");
//		}
//		return str.toString().trim();
//	}
//}
	
