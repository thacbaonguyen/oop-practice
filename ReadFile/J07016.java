package ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class J07016 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> arr1 = (ArrayList<Integer>) input1.readObject();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) input2.readObject();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for(Integer x : arr1) map1.put(x, map1.getOrDefault(x, 0) + 1);
		for(Integer x : arr2) map2.put(x, map2.getOrDefault(x, 0) + 1);
		TreeSet<Integer> set = new TreeSet<>();
		for(int x : map1.keySet()){
			if(map2.containsKey(x) && isPrime(x)) set.add(x);
		}
		for(int x : set) {
			System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
		}
	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2) return true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0 ) return false;
		}
		return true;
	}
}
