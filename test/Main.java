package Test;

import java.util.ArrayList;

public class Main {
	public static void main(String arg[]) {
//		ArrayList<Integer> arr1 = new ArrayList<>();
//		ArrayList<Integer> arr2 = new ArrayList<>();
//		arr1.add(100);
//		arr1.add(200);
//		arr1.add(300);
//		arr1.add(200);
//		arr1.add(200);
//		arr2.add(300);
//		arr2.add(200);
//		arr1.retainAll(arr2);
//		for(Integer x : arr1) System.out.println(x);
		System.out.println(isReverse(123321));
	}
	public static boolean isReverse(int n) {
		String s = n + "";
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		if(s.equals(sb.toString())) return true;
		return false;
	}
}
