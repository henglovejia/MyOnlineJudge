package cn.edu.ecnu.heng.xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static class Node implements Comparable<Node> {

		public Node() {

		}

		@Override
		public int compareTo(Node data) {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int m = scanner.nextInt();
		int max = -1;
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scanner.nextInt();
			max = h[i] > max ? h[i] : max;
		}
		scanner.close();
		Arrays.sort(h);
		for (int i = 0; i < h.length / 2; i++) {
			int tmp = h[i];
			h[i] = h[h.length - 1 - i];
			h[h.length - 1 - i] = tmp;
		}
		if (!kill(h, max, t, m)) {
			System.out.println(-1);
			return;
		}
		binarySearch(h, max, t, m);
	}

	public static void binarySearch(int[] h, int max, int t, int m) {
		int low = 1;
		int heigh = max;
		int middle = 0;
		while (low < heigh) {
			middle = (heigh + low) / 2;
			if (kill(h, middle, t, m)) {
				heigh = middle;
			} else {
				low = middle + 1;
			}
		}
		System.out.println(low);
	}

	public static boolean kill(int[] h, int x, int t, int m) {
		int wuli = t - m;
		int[] left = new int[h.length];
		for (int i = 0; i < h.length; i++) {
			int killTimes = h[i] / x;
			if (killTimes <= m) {
				m -= killTimes;
				left[i] = h[i] - x * killTimes;
			} else {
				left[i] = h[i] - x * m;
				m = 0;
				break;
			}
		}
		Arrays.sort(left);
		for (int i = 0; i < left.length - m; i++) {
			wuli -= left[i];
			if (wuli < 0) {
				return false;
			}
		}
		return true;
	}
}
