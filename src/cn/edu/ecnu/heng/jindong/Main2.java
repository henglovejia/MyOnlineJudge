package cn.edu.ecnu.heng.jindong;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] map = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		boolean isContinue = true;
		while (isContinue) {
			isContinue = false;
			int[][] mask = new int[5][5];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (map[i][j] != 0) {
						for (int k = i + 1; k < 5; k++) {
							if (map[k][j] == 0) {
								continue;
							}
							if (map[i][j] == map[k][j]) {
								mask[i][j] = 1;
								mask[k][j] = 1;
								isContinue = true;
							}
							break;
						}
					}
					if (map[i][j] != 0) {
						for (int k = j + 1; k < 5; k++) {
							if (map[i][j] == 0) {
								continue;
							}
							if (map[i][j] == map[i][k]) {
								mask[i][j] = 1;
								mask[i][k] = 1;
								isContinue = true;
							}
							break;
						}
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					map[i][j] = map[i][j] * (1 - mask[i][j]);
				}
			}
		}
		int result = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (map[i][j] != 0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
