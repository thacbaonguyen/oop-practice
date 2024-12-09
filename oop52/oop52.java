package oop52;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oop52 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("VANBAN.in"));
		HashMap<String, Integer> map = new HashMap<>();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i ++) {
			String s = sc.nextLine().toLowerCase();
			String a[] = s.split("[^a-z0-9]+");
			for(String x : a) {
				if(!x.isEmpty()) map.put(x, map.getOrDefault(x, 0) + 1);
			}
		}
		ArrayList<Pair> arr = new ArrayList<>();
		for(Map.Entry<String, Integer> x : map.entrySet()) {
			arr.add(new Pair(x.getKey(), x.getValue()));
		}
		Collections.sort(arr);
		for(Pair x : arr) System.out.println(x);
	}
}
class Pair implements Comparable<Pair> {
	private String first;
	private Integer second;
	public Pair(String first, Integer second) {
		this.first = first;
		this.second = second;
	}
	@Override
	public int compareTo(Pair o) {
		if(second != o.second) return Integer.compare(o.second, second);
		return first.compareTo(o.first);
	}
	@Override
	public String toString() {
		return first + " " + second;
	}
}
