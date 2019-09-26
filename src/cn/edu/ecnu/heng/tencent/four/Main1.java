package cn.edu.ecnu.heng.tencent.four;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			scanner.nextLine();
			String line = scanner.nextLine();
			if (n < 11) {
				System.out.println("NO");
			}
			int index = line.indexOf("8");
			int end = n - 11;
			if (index >= 0 && index <= end) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}

}
