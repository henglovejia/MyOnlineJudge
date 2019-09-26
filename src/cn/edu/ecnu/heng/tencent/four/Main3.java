package cn.edu.ecnu.heng.tencent.four;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.sort(list);
		for (int i = 0; i < n; i += 2) {
			System.out.print(list[i] + " ");
		}
		for (int i = n - (n & 1) - 1; i > 0; i -= 2) {
			System.out.print(list[i] + " ");
		}
	}

}
