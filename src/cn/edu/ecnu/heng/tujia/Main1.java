package cn.edu.ecnu.heng.tujia;

import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static List<Integer> list;
	static int T;
	static int count =Integer.MAX_VALUE;

	public static void run(int sec, int m, int space) {
		if (sec > T) {
			return;
		}
		if (space <= 0) {
			count  = count < sec ? count:sec;
			return;
		}
		if(17 * (T-sec) < space) {
			return;
		}
		run(sec + 1, m, space - 13);
		run(sec + 1, m + 4, space);
		if (m >= 10) {
			run(sec + 1, m - 10, space - 50);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		T = scanner.nextInt();
		scanner.close();
		run(0, m, s);
		if (count <= T) {
			System.out.println("Yes " + count);
		} else {
			System.out.println("No");
		}
	}

}
