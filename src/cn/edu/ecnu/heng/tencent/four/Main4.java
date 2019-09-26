package cn.edu.ecnu.heng.tencent.four;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long max = -1;
		int count = 0;
		long[] list = new long[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextLong();
			max = max > list[i] ? max : list[i];
		}
		scanner.close();
		for (int i = 0; i < max; i++) {
			count++;
			Boolean flag = null;
			for (int j = 0; j < n; j++) {
				if (list[j] > i) {
					if (flag != null && !flag) {
						count++;
					}
					flag = true;
				} else if (list[j] == i) {
					flag = false;
				}
			}
		}
		System.out.println(count);
	}

}
