package test;

import java.util.ArrayList;

public class Main {
	public static void main(String arg[]) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr1.add(100);
		arr1.add(200);
		arr1.add(300);
		arr1.add(200);
		arr1.add(200);
		arr2.add(300);
		arr2.add(200);
		arr1.retainAll(arr2);
		arr1.clear();
		for(Integer x : arr1) System.out.println(x);
	}
}
