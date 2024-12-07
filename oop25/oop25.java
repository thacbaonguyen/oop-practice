package oop25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class oop25 {
	public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
//class WordSet {
//	private Scanner sc;
//	private TreeSet<String> set;
//	public WordSet(String input) {
//		try {
//			sc = new Scanner(new File(input));
//			String s = "";
//			set = new TreeSet<>();
//			while(sc.hasNextLine()) {
//				s = sc.nextLine();
//				s = s.toLowerCase();
//				String str[] = s.split("\\s+");
//				set.addAll(Arrays.asList(str));
//			}
//		} catch (FileNotFoundException e) {
//		}
//	}
//	public TreeSet<String> getMySet() {
//		return this.set;
//	}
//	public String difference(WordSet set2) {
//		String s = "";
//		TreeSet<String> newSet = new TreeSet<>(this.set);
//		newSet.removeAll(set2.getMySet());
//		
//		for(String x : newSet) {
//			s += x + " ";
//		}
//		return s;
//	}
//}
