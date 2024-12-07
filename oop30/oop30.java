package oop30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class oop30 {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATRIX.in"));
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int k = sc.nextInt() - 1;
			int[][] a = new int[N][M];
			int[] b = new int[N];
			for(int j = 0; j <N; j++) {
				for(int l = 0; l < M; l++) {
					a[j][l] = sc.nextInt();
					if(k == l) b[j] = a[j][l];
				}
			}
			Arrays.sort(b);
			for(int j = 0; j <N; j++) a[j][k] = b[j];
			for(int j = 0; j <N; j++) {
				for(int l = 0; l < M; l++) {
					System.out.printf("%d ", a[j][l]);
				}
				System.out.println();
			}
		}
		
	}
}
