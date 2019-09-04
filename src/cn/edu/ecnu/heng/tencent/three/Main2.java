package cn.edu.ecnu.heng.tencent.three;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
			int tmp = list[i] * list[i];
			max = max > tmp ? max : tmp;
		}
		scanner.close();
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				int min = list[j];
				int sum = list[j];
				for (int k = 1; k <= i; k++) {
					min = min < list[j + k] ? min : list[j + k];
					sum += list[j + k];
				}
				int result = sum * min;
				max = max > result ? max : result;
			}
		}
		System.out.println(max);
	}

}
