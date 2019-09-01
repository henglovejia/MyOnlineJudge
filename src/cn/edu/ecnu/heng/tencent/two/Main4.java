package cn.edu.ecnu.heng.tencent.two;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] map = new int[n][3];
		int y = -1;
		int cost = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				map[i][j] = scanner.nextInt();
			}
			if (y == -1) {
				y = argMax(map[0]);
				cost += map[0][y];
			} else {
				if (y == 1) {
					y = argMax(map[i]);
					if (map[i][y] == 0) {
						cost = -cost;
					} else {
						cost += map[i][y];
					}
				} else {
					if (y == 0) {
						if (cost < 0) {
							if (map[i][0] < map[i][1]) {
								cost += map[i][0];
								y = 0;
							} else {
								cost += map[i][1];
								y = 1;
							}
						} else {
							if (map[i][0] > map[i][1]) {
								cost += map[i][0];
								y = 0;
							} else {
								cost += map[i][1];
								y = 1;
							}
						}
					} else {
						if (cost < 0) {
							if (map[i][1] < map[i][2]) {
								cost += map[i][1];
								y = 1;
							} else {
								cost += map[i][2];
								y = 2;
							}
						} else {
							if (map[i][1] > map[i][2]) {
								cost += map[i][1];
								y = 1;
							} else {
								cost += map[i][2];
								y = 2;
							}
						}
					}
				}
			}
		}
		scanner.close();
		System.out.println(cost);
	}

	public static int argMax(int[] line) {
		if (line[0] == 0) {
			return 0;
		}
		if (line[1] == 0) {
			return 1;
		}
		if (line[2] == 0) {
			return 2;
		}
		if (line[0] > line[1]) {
			if (line[0] > line[2]) {
				return 0;
			} else {
				return 2;
			}
		} else {
			if (line[1] > line[2]) {
				return 1;
			} else {
				return 2;
			}
		}
	}

}
