package ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class J07023 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inp1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream inp2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> arr1 = (ArrayList<Integer>) inp1.readObject();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) inp2.readObject();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for(int x : arr1) map1.put(x, map1.getOrDefault(x, 0) + 1); 
		for(int x : arr2) map2.put(x, map2.getOrDefault(x, 0) + 1);
		TreeSet<Integer> set = new TreeSet<>();
		for(int x : map1.keySet()) {
			if(map2.containsKey(x)&& isPrime(x) && isReverse(x)) set.add(x);
		}
		for(int x : set) System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0 || n % 3 == 0) return false;
		for(int i = 5; i <= Math.sqrt(n); i +=6) {
			if(n % i == 0 || n % (i + 2) == 0) return false;
		}
		return true;
	}
	public static boolean isReverse(int n) {
		int m = n, reverse = 0;
		while(n > 0) {
			int k = n % 10;
			reverse = reverse* 10 + k;
			n/=10;
		}
		return m == reverse;
	}
}
