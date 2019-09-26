package cn.edu.ecnu.heng.tencent.four;

import java.util.Scanner;

public class Main2 {

	public static int fenshua(int[][] list, int index, int oldColor, int newColor, int cost) {
		if (oldColor == newColor) {
			return Integer.MAX_VALUE;
		}
		if (index == list.length - 1) {
			return list[index][newColor];
		}
		int left = fenshua(list, index + 1, newColor, 0, cost + list[index + 1][0]);
		int mid = fenshua(list, index + 1, newColor, 1, cost + list[index + 1][1]);
		int right = fenshua(list, index + 1, newColor, 2, cost + list[index + 1][2]);
		int tmp = left < mid ? left : mid;
		return tmp < right ? tmp : right + cost;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] list = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				list[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		int left = fenshua(list, 0, -1, 0, 0);
		int mid = fenshua(list, 0, -1, 1, 0);
		int right = fenshua(list, 0, -1, 2, 0);
		int tmp = left < mid ? left : mid;
		System.out.println(tmp < right ? tmp : right);
	}

}
