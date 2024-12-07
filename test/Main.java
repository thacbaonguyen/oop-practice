package test;

public class Main {
	public static void main(String arg[]) {
		String[] s = new String[100];
		String r = "Nguyen Thac Bao";
		s = r.split("\\s+");
		for(String x : s) {
			System.out.println(x);
		}
	}
}
