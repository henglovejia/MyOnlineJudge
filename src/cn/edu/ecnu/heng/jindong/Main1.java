package cn.edu.ecnu.heng.jindong;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int changeCount = 0;
		int capsCount = 0;
		String line = scanner.nextLine();
		boolean isCaps = false;
		boolean isShift = false;
		scanner.close();
		for (int i = 0; i < n; i++) {
			char item = line.charAt(i);
			boolean chState = isCaps(item);
			if (isShift && chState && !isCaps) {
				capsCount = 3;
				isCaps = true;
			}
			if (!isCaps && chState) {
				changeCount++;
				capsCount = 1;
				isShift = true;
			}
			if (!chState && isCaps) {
				capsCount--;
				changeCount++;
			}
			if (capsCount == 0) {
				changeCount++;
				isCaps = false;
			}
			// if (chState) {
			// capsCount++;
			// }
			// if (isCaps ^ chState) {
			// isCaps = chState;
			// if (chState) {
			// changeCount++;
			// } else {
			// if (capsCount > 1) {
			// changeCount++;
			// }
			// capsCount = 0;
			// }
			// }
		}
		System.out.println(changeCount + n);
	}

	public static boolean isCaps(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		}
		return false;
	}
}
