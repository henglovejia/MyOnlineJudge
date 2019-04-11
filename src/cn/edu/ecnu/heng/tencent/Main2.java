package cn.edu.ecnu.heng.tencent;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d[] = new int[n];
		int p[] = new int[n];
		int sumD = 0;
		int sumP = 0;
		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			if (sumD < d[i]) {
				sumP += p[i];
				sumD += d[i];
			}
		}
		System.out.println(sumP);
	}
}
