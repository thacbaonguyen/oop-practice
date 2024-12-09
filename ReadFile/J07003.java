package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		String s = sc.next();
		int n = (int)s.length()/2;
		while(n > 0) {
			BigInteger large1 = new BigInteger(s.substring(0, n));
			BigInteger large2 = new BigInteger(s.substring(n));
			BigInteger largeSum = large1.add(large2);
			s = largeSum +"";
			System.out.println(s);
			n = (int)s.length()/2;
		}
		
	}
}
