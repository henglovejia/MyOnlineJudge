package cn.edu.ecnu.heng.pinduoduo.two;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		int[] list = new int[n * m];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				list[index++] = i * j;
			}
		}
		Arrays.sort(list);
		System.out.println(list[n * m - k]);
	}

}
