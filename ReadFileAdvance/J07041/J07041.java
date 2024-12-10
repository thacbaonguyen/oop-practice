package ReadFileAdvance.J07041;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class J07041 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Pair> arr = (ArrayList<Pair>) input.readObject();
		ArrayList<Pair> result = new ArrayList<>();
		Map<Pair, Integer> map = new HashMap<>();
		for(Pair x : arr) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
				result.add(x);
			}
		}
		Collections.sort(result);
		for(Pair x : result) System.out.println(x);
	}
}
//class Pair implements Serializable, Comparable<Pair>{
//	private int first, second;
//	
//
//	public Pair(int first, int second) {
//		super();
//		this.first = first;
//		this.second = second;
//	}
//	
//
//	public int getFirst() {
//		return first;
//	}
//
//	public int getSecond() {
//		return second;
//	}
//
//	@Override
//	public int compareTo(Pair o) {
//		return this.first - o.first;
//	}
//	@Override
//	public String toString() {
//		return "(" + first + ", " + second + ")";
//	}
//}
//
