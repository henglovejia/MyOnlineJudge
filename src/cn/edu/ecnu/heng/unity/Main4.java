package cn.edu.ecnu.heng.unity;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int f = scanner.nextInt();
		int n = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		scanner.close();
		int count = 0;
		int buyIndex = 0;
		for (int i = 1; i < n; i++) {
			if (list[i] - list[buyIndex] > f) {
				if (i < n - 1) {
					if (list[i] > list[i + 1]) { // 到达山峰,卖掉产品
						count += (list[i] - list[buyIndex] - f);
						buyIndex = i + 1;
						continue;
					}
				} else {
					count += (list[i] - list[buyIndex] - f);
				}
			}
			if (list[i] < list[buyIndex]) { // 到达低谷,买入商品
				buyIndex = i;
			}
		}
		System.out.println(count);
	}
}
