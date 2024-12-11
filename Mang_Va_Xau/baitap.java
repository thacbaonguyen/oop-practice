package Mang_Va_Xau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class baitap {
	public static void main(String arg[])
	{	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		Collections.sort(list);
		System.out.println(list.get(1));
	}

}
