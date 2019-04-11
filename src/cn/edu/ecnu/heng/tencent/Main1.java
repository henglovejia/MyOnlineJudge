package cn.edu.ecnu.heng.tencent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>(n);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			list.add(tmp);
			sum += tmp;
		}
		scanner.close();
		if (sum < s) {
			System.out.println(-1);
			return;
		}
		if (sum == s) {
			System.out.println(0);
			return;
		}
		Collections.sort(list);
		int min = list.get(0);
		for (int i = 0; i < n; i++) {
			s -= (list.get(i) - min);
		}
		if (s <= 0) {
			System.out.println(min);
		} else {
			if (s % n == 0) {
				System.out.println(min - s / n);
			} else {
				System.out.println(min - s / n - 1);
			}
		}
	}

}
