package oop52;

public class Pair implements Comparable<Pair> {
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
