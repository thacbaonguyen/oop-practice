package OOP21;

import java.util.HashSet;
import java.util.TreeSet;

public class IntSet {
	private TreeSet<Integer> set;
	public IntSet(int[] a) {
		set = new TreeSet<>();
		for(int x : a) {	
			set.add(x);
		}
	}
	public IntSet(TreeSet<Integer> set) {
		this.set = new TreeSet<>(set);
	}
	public IntSet intersection(IntSet s2) {
		TreeSet<Integer> result = new TreeSet<>(set);
		result.retainAll(s2.set);
		return new IntSet(result);
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int x : set) {
			str.append(x).append(" ");
		}
		return str.toString().trim();
	}
	
}
