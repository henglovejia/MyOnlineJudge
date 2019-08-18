package cn.edu.ecnu.heng.tencent.two;

import java.util.Scanner;

public class Main2 {
	public static int[] list;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 1 << scanner.nextInt();
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] num = new int[m];
		for (int i = 0; i < n; i++) {
			num[i] = 1 << scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j += num[i]) {
				int end = j + num[i] - 1;
				for (int k = 0; k < num[i] / 2; k++) {
					int temp = list[j + k];
					list[j + k] = list[end - k];
					list[end - k] = temp;
				}
			}
			// System.out.println(findReverseCount(list.clone(), num[i]));
			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (list[j] > list[k]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	public static int findReverseCount(int[] input, int reverseLength) {
		if (input == null || input.length == 0) {
			return 0;
		}
		int low = 0;
		int high = input.length - 1;
		return findReverseCountHelper(input, low, high, reverseLength);
	}

	public static int findReverseCountHelper(int[] input, int low, int high, int reverseLength) {
		if (low == high) {
			return 0;
		}
		int mid = (low + high) / 2;
		int left = findReverseCountHelper(input, low, mid, reverseLength);
		int right = findReverseCountHelper(input, mid + 1, high, reverseLength);
		int count = merge(input, mid, low, high, reverseLength);
		return left + right + count;

	}

	public static int merge(int[] input, int mid, int low, int high, int reverseLength) {
		int[] temp = new int[input.length + 1];
		for (int i = low; i <= high; i++) {
			temp[i] = input[i];
		}
		int leftEnd = mid;
		int rightEnd = high;
		int index = high;
		int count = 0;
		while (leftEnd >= low && rightEnd >= mid + 1) {
			if (temp[leftEnd] > temp[rightEnd]) {
				count = count + rightEnd - mid;
				input[index] = temp[leftEnd];
				leftEnd--;
			} else {
				input[index] = temp[rightEnd];
				rightEnd--;
			}
			index--;
		}
		while (leftEnd >= low) {
			input[index] = temp[leftEnd];
			leftEnd--;
			index--;
		}
		while (rightEnd >= mid + 1) {
			input[index] = temp[rightEnd];
			rightEnd--;
			index--;
		}
		return count++;
	}

}
