package ReadFileAdvance.J07012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class J07012 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String> arr = (ArrayList<String>) os.readObject();
		os.close();
		HashMap<String, Integer> map = new HashMap<>();
		for(String x : arr) {
			x = x.toLowerCase().trim();
			String s[] = x.split("[^a-z0-9]+");
			for(String y : s) {
				if(!y.isEmpty()) map.put(y, map.getOrDefault(y, 0) + 1);
			}
		}
		ArrayList<Pair> result = new ArrayList<>();
		for(Map.Entry<String, Integer> x : map.entrySet()) result.add(new Pair(x.getKey(), x.getValue()));
		Collections.sort(result);
		for(Pair x : result) System.err.println(x);
	}
}
//class Pair implements Comparable<Pair> {
//	private String first;
//	private Integer second;
//
//	public Pair(String first, Integer second) {
//		super();
//		this.first = first;
//		this.second = second;
//	}
//
//	@Override
//	public int compareTo(Pair o) {
//		if (this.second != o.second)
//			return Integer.compare(o.second, this.second);
//		return o.first.compareTo(first);
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return first + " " + second;
//	}
//}