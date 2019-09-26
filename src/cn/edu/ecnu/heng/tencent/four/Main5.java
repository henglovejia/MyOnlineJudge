package cn.edu.ecnu.heng.tencent.four;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = scanner.nextInt();
		scanner.close();
		int[] count = new int[2];
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'F') {
				count[0]++;
			} else {
				count[1]++;
			}
		}
		if (count[1] <= n) {
			System.out.println(line.length() - n + count[1]);
		} else {
			int number = 0;
			boolean flag = true;
			int tmp = count[1];
			for (int i = 0; i < line.length() - ((count[1] & 1) == (n & 1) ? 0 : 1); i++) {
				char temp = line.charAt(i);
				if (temp == 'T') {
					if (tmp > 0) {
						tmp--;
						number++;
					} else {
						flag = !flag;
					}
				} else {
					number += (flag ? 1 : -1);
				}
			}
			System.out.println(number);
		}
	}

}
