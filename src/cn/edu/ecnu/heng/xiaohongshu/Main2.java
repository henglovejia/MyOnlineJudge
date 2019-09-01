package cn.edu.ecnu.heng.xiaohongshu;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scanner.nextInt();
		}
		scanner.close();
		int yes = 0, no = 0;
		for (int i = 0; i < n; i += 2) {
			yes += h[i];
		}
		for (int i = 1; i < n; i += 2) {
			no += h[i];
		}
		if (yes > no) {
			System.out.println(yes + " " + n / 2);
		} else {
			System.out.println(no + " " + n / 2);
		}
	}

	public static int[] count(int[] h, int index, boolean choose, int[] count) {
		if (index > h.length - 1) {
			if (choose) {
				return new int[] { h[h.length - 1], 1 };
			}
			return new int[2];
		}
		int[] yes, no;
		if (choose) {
			yes = count(h, index + 2, true, new int[] { count[0] });
			no = count(h, index + 2, false, new int[] {});
		} else {
			yes = count(h, index + 1, true, new int[] {});
			no = count(h, index + 1, false, new int[] {});
		}
		if (yes[0] > no[0]) {
			return yes;
		}
		return no;
	}

}
