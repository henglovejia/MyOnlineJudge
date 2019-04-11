package cn.edu.ecnu.heng.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> list = new ArrayList<>();
		String[] zore = new String[] { "", "0000000", "000000", "00000", "0000", "000", "00", "0" };
		for (int i = 0; i < n; i++) {
			String item = scanner.next();
			int maxLength = item.length() / 8 * 8;
			for (int j = 0; j < maxLength; j += 8) {
				list.add(item.substring(j, j + 8));
			}
			if (maxLength != item.length()) {
				list.add(item.substring(maxLength) + zore[item.length() - maxLength]);
			}
		}
		scanner.close();
		Collections.sort(list);
		for (String item : list) {
			System.out.print(item + " ");
		}
	}

}
