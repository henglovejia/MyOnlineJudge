package cn.edu.ecnu.heng.tencent.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		int[] A = new int[n];
		int[] B = new int[n];
		int Amin = Integer.MAX_VALUE;
		int Bmin = Integer.MAX_VALUE;
		Map<Integer, Integer> bMap = new HashMap<Integer, Integer>();
		line = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(line[i]);
			Amin = Amin < A[i] ? Amin : A[i];
		}
		line = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			B[i] = Integer.parseInt(line[i]);
			Bmin = Bmin < B[i] ? Bmin : B[i];
			bMap.put(B[i], bMap.containsKey(B[i]) ? bMap.get(B[i]) + 1 : 1);
		}
		scanner.close();
		int min = Amin * Bmin;
		for (;; min++) {
			for (int i = 0; i < n; i++) {
				if (min % A[i] == 0) {
					k -= bMap.containsKey(min / A[i]) ? bMap.get(min / A[i]) : 0;
					if (k <= 0) {
						System.out.println(min);
						return;
					}
				}
			}
		}
	}

}
