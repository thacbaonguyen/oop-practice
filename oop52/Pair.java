package oop52;

public class Pair<X extends Comparable, Y extends Comparable> implements Comparable<Pair> {
	private X first;
	private Y second;
	public Pair(X first, Y second) {
		this.first = first;
		this.second = second;
	}
	@Override
	public int compareTo(Pair o) {
		if(!second.equals(o.second)) return o.second.compareTo(second);
		return first.compareTo(o.first);
	}
	@Override
	public String toString() {
		return first + " " + second;
	}
}
