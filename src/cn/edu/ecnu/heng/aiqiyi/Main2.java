package cn.edu.ecnu.heng.aiqiyi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n - 1];
		int num = 0;
		for (int i = 0; i < n - 1; i++) {
			list[i] = scanner.nextInt();
			if (list[i] == 1) {
				num++;
			}
		}
		scanner.close();
		long count = (long) Math.pow(n - 2, num-1) + 1;
		long mod = (long) Math.pow(10, 9) + 7;
		System.out.println(count % mod);
	}

}
