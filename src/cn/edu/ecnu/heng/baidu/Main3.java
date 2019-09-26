package cn.edu.ecnu.heng.baidu;

import java.util.Scanner;

public class Main3 {

	public static class Operation {
		public int l, r, v;

		public Operation(int l, int r, int v) {
			this.l = l;
			this.r = r;
			this.v = v;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		Operation[] operations = new Operation[m];
		for (int i = 0; i < m; i++) {
			operations[i] = new Operation(scanner.nextInt() - 1, scanner.nextInt(), scanner.nextInt());
		}
		int k = scanner.nextInt();
		for (int i = 0; i < k; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt();
			for (int j = a; j < b; j++) {
				int l = operations[j].l;
				int r = operations[j].r;
				int v = operations[j].v;
				for (int o = l; o < r; o++) {
					list[o] += v;
				}
			}
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
