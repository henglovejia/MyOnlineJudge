package cn.edu.ecnu.heng.ebay;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		short[] list = new short[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextShort();
		}
		int m = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			map.clear();
			int count = 0;
			int l = scanner.nextInt() - 1;
			int r = scanner.nextInt();
			for (int j = l; j < r; j++) {
				int key = list[j];
				if (!map.containsKey(key)) {
					map.put(key, 1);
					count++;
				} else if (map.get(key) == 1) {
					count--;
					map.put(key, 2);
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}

}
