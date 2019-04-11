package cn.edu.ecnu.heng.huawei;

import java.util.Scanner;

public class Main3 {
	public static long number = 0;
	public static int n, m;
	public static int[][] map;

	public static void route(int startX, int startY, int endX, int endY) {
		if (startX == endX && startY == endY) {
			number++;
			return;
		}
		if (startX + 1 < n && map[startX][startY] < map[startX + 1][startY]) {
			route(startX + 1, startY, endX, endY);
		}
		if (startY + 1 < m && map[startX][startY] < map[startX][startY + 1]) {
			route(startX, startY + 1, endX, endY);
		}
		if (startX > 0 && map[startX][startY] < map[startX - 1][startY]) {
			route(startX - 1, startY, endX, endY);
		}
		if (startY > 0 && map[startX][startY] < map[startX][startY - 1]) {
			route(startX, startY - 1, endX, endY);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		int startX = scanner.nextInt(), startY= scanner.nextInt(), endX= scanner.nextInt(), endY= scanner.nextInt();
		scanner.close();
		route(startX,  startY,  endX,  endY);
		System.out.println(number % (long)Math.pow(10, 9));
	}

}
