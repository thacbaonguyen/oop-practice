package oop23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class oop23 {
	public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
//class WordSet {
//	private Scanner sc;
//	private TreeSet<String> set;
//	
//	public WordSet(String input) {
//		try {
//			sc = new Scanner(new File(input));
//			String s = "";
//			set = new TreeSet<>();
//			while(sc.hasNextLine()) {
//				s = sc.nextLine();
//				s = s.toLowerCase();
//				String[] s1 = s.split("\\s+");
//				set.addAll(Arrays.asList(s1));
//			}
//		} catch (FileNotFoundException e) {
//		}
//		
//	}
//	public TreeSet<String> getMySet(){
//		return set;
//	}
//	public String union(WordSet wordSet) {
//		String res = "";
//		TreeSet<String> newSet = new TreeSet<>(wordSet.getMySet());
//		newSet.addAll(set);
//		for(String x : newSet) {
//			res += x + " ";
//		}
//		return res;
//	}
//	public String intersection(WordSet wordSet) {
//		String res = "";
//		TreeSet<String> newSet = wordSet.getMySet();
//        for (String i : set)
//            if (newSet.contains(i))
//            	 res += i + " ";
//		return res;
//	}
//}
//class WordSet
//{
//    private Scanner sc;
//    private TreeSet<String> mySet;
//
//    public WordSet(String inp) throws IOException
//    {
//        sc = new Scanner(new File(inp));
//        mySet = new TreeSet<>();
//        String s;
//        while (sc.hasNextLine())
//        {
//            s = sc.nextLine();
//            s = s.toLowerCase();
//            String[] arr = s.split("\\s+");
//            mySet.addAll(Arrays.asList(arr));
//        }
//    }
//
//    public TreeSet<String> getMySet()
//    {
//        return mySet;
//    }
//    
//    public String union(WordSet wordSet)
//    {
//        String res = "";
//        TreeSet<String> set = new TreeSet<>(wordSet.getMySet());
//        set.addAll(mySet);
//        for (String i : set)
//            res += i + " ";
//        return res;
//    }
//    
//    public String intersection(WordSet wordSet)
//    {
//        String res = "";
//        TreeSet<String> set = wordSet.getMySet();
//        for (String i : mySet)
//            if (set.contains(i))
//                res += i + " ";
//        return res;
//    }
//}
