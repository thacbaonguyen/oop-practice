package ReadFileAdvance.J07012;

public class Pair implements Comparable<Pair> {
	private String first;
	private Integer second;

	public Pair(String first, Integer second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Pair o) {
		if (this.second != o.second)
			return Integer.compare(o.second, this.second);
		return this.first.compareTo(o.first);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return first + " " + second;
	}
}
