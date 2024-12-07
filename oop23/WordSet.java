package oop23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
	private Scanner sc;
	private TreeSet<String> set;
	
	public WordSet(String input) {
		try {
			sc = new Scanner(new File(input));
			String s = "";
			set = new TreeSet<>();
			while(sc.hasNextLine()) {
				s = sc.nextLine();
				s = s.toLowerCase();
				String s1[] = s.split("\\s+");
				set.addAll(Arrays.asList(s1));
			}
		} catch (FileNotFoundException e) {
		}
		
	}
	public TreeSet<String> getMySet(){
		return set;
	}
	public String union(WordSet wordSet) {
		StringBuilder stringBuilder = new StringBuilder();
		TreeSet<String> newSet = new TreeSet<>(wordSet.getMySet());
		set.addAll(newSet);
		for(String x : set) {
			stringBuilder.append(x).append(" ");
		}
		return stringBuilder.toString().trim();
	}
	public String intersection(WordSet wordSet) {
		StringBuilder stringBuilder = new StringBuilder();
		TreeSet<String> newSet = wordSet.getMySet();
        for (String i : set)
            if (newSet.contains(i))
                stringBuilder.append(i).append(" ");
		return stringBuilder.toString().trim();
	}
}
