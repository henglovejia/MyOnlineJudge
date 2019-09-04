package cn.edu.ecnu.heng.xiecheng;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] items = scanner.nextLine().split(" ");
		int[] data = new int[items.length];
		for (int i = 0; i < items.length; i++) {
			data[i] = Integer.parseInt(items[i]);
		}
		scanner.close();
		if(items.length==1) {
			System.out.println(data[0]);
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = items.length - 1; i > -1; i--) {
			for (int j = 0; j + i < items.length; j++) {
				int tmp = 1;
				for (int k = j; k <= i + j; k++) {
					tmp *= data[k];
				}
				max = max > tmp ? max : tmp;
			}
			if (max > 0) {
				System.out.println(max);
				return;
			}
		}
	}

}
