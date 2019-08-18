package cn.edu.ecnu.heng.tencent.two;

import java.util.Scanner;

public class Main3 {

	public static class NestedData implements Comparable<NestedData> {

		public NestedData() {

		}

		@Override
		public int compareTo(NestedData data) {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] floors = new int[n];
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			floors[i] = scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			int after = 0, before = 0;
			int afterMax = 0, beforeMax = 0;
			for (int j = i + 1; j < n; j++) {
				if (floors[j] > afterMax) {
					after++;
					afterMax = floors[j];
				}
			}
			for (int j = i - 1; j > -1; j--) {
				if (floors[j] > beforeMax) {
					before++;
					beforeMax = floors[j];
				}
			}
			nums[i] = before + after + 1;
		}
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
