package cn.edu.ecnu.heng.mihayou;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		String[][] list = new String[r][n];
		for (int i = 0; i < r; i++) {
			String[] items = scanner.next().split("");
			for (int j = 0; j < n; j++) {
				list[i][j] = items[j];
			}
		}
		int r1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		int r2 = scanner.nextInt();
		int c2 = scanner.nextInt();
		scanner.close();
		int count = 0;
		String tmp = list[r1][c1];
		list[r1][c1] = list[r2][c2];
		list[r2][c2] = tmp;
		boolean go = true;
		while (go) {
			go = false;
			if (r1 > 1) {
				if (list[r1][c1].equals(list[r1 - 1][c1]) && list[r1][c1].equals(list[r1 - 2][c1])) {
					count += 2;
					go = true;
				}
			}
			if (r1 < r - 2) {
				if (list[r1][c1].equals(list[r1 + 1][c1]) && list[r1][c1].equals(list[r1 + 2][c1])) {
					count += 2;
					go = true;
				}
			}
			if (r2 > 1) {
				if (list[r2][c2].equals(list[r2 - 1][c2]) && list[r2][c2].equals(list[r2 - 2][c2])) {
					count += 2;
					go = true;
				}
			}
			if (r2 < r - 2) {
				if (list[r2][c2].equals(list[r2 + 1][c2]) && list[r2][c2].equals(list[r2 + 2][c2])) {
					count += 2;
					go = true;
				}
			}
			if (c1 > 1) {
				if (list[r1][c1].equals(list[r2][c1 - 1]) && list[r1][c1].equals(list[r1][c1 - 2])) {
					count += 2;
					go = true;
				}
			}
			if (c1 < n - 2) {
				if (list[r1][c1].equals(list[r2][c1 + 1]) && list[r1][c1].equals(list[r1][c1 + 2])) {
					count += 2;
					go = true;
				}
			}
			if (c2 > 1) {
				if (list[r2][c2].equals(list[r2][c2 - 1]) && list[r2][c2].equals(list[r2][c2 - 2])) {
					count += 2;
					go = true;
				}
			}
			if (c2 < n - 2) {
				if (list[r2][c2].equals(list[r2][c2 + 1]) && list[r2][c2].equals(list[r2][c2 + 2])) {
					count += 2;
					go = true;
				}
			}
		}
		if (count != 0) {
			System.out.println(count + 1);
		} else {
			System.out.println(0);
		}
	}

}
