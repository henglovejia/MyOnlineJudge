package cn.edu.ecnu.heng.gaotong;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int t = scanner.nextInt();
			int x = scanner.nextInt();
			int[] tmp = new int[x];
			for (int j = 0; j < x; j++) {
				tmp[j] = list[j];
			}
			Arrays.sort(tmp);
			if (t == 1) {
				for (int j = 0; j < x; j++) {
					list[j] = tmp[j];
				}
			} else {
				for (int j = 0; j < x; j++) {
					list[x - j - 1] = tmp[j];
				}
			}
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
